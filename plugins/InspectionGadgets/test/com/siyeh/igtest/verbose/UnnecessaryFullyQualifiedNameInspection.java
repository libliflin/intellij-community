package com.siyeh.igtest.verbose;

import java.io.PrintStream;
import java.util.Properties;
       
/**
 * {@link java.lang.String}
 */
public class UnnecessaryFullyQualifiedNameInspection
{
    private String m_string1;
    private java.lang.String m_string;
    private java.util.StringTokenizer m_map;
    private java.util.List m_list;
    private java.util.Map.Entry m_mapEntry;
    private java.awt.List m_awtList;
    PrintStream stream = java.lang.System.out;
    Properties props = java.lang.System.getProperties();
}