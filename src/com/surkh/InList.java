package com.surkh;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class InList {

    public static void main(String[] args) {
        try {
            Clipboard systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            String clipboard = (String) systemClipboard.getContents(null).getTransferData(DataFlavor.stringFlavor);
            systemClipboard.setContents(new StringSelection(clipboard.replaceAll("\n", ",")), null);
        } catch (UnsupportedFlavorException | IOException e ) {
            System.out.print("Unable to get text from clipboard");
        }
    }
}
