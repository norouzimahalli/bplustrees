/* 
This file is part of JHAVE -- Java Hosted Algorithm Visualization
Environment, developed by Tom Naps, David Furcy (both of the
University of Wisconsin - Oshkosh), Myles McNally (Alma College), and
numerous other contributors who are listed at the http://jhave.org
site

JHAVE is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License as published by the Free
Software Foundation, either version 3 of the License, or (at your
option) any later version.

JHAVE is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with the JHAVE. If not, see:
<http://www.gnu.org/licenses/>.
*/

/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
package exe.memorymanager;

public interface ParserConstants {

  int EOF = 0;
  int TITLE = 1;
  int GRIDSIZE = 2;
  int DRAWGRID = 3;
  int COMMENT = 4;
  int ENDOFCOMMENT = 7;
  int LANGUAGE = 8;
  int SMALLFONT = 9;
  int EOL = 10;
  int INFO = 15;
  int LPAREN = 16;
  int RPAREN = 17;
  int LBRACE = 18;
  int RBRACE = 19;
  int STAR = 20;
  int EQUAL = 21;
  int COMMA = 22;
  int SEMICOLON = 23;
  int SQUOTE = 24;
  int DQUOTE = 25;
  int LOGICALCONNECTOR = 26;
  int NODE = 27;
  int NEW = 28;
  int DELETE = 29;
  int CREATELIST = 30;
  int NULL = 31;
  int WHILE = 32;
  int FOR = 33;
  int BREAK = 34;
  int IF = 35;
  int ELSE = 36;
  int REDRAW = 37;
  int SP = 38;
  int CHAR = 39;
  int CHARLIST = 40;
  int STRING = 41;
  int INT = 42;
  int REAL = 43;
  int IDENTIFIER = 44;
  int DEREFERENCEOP = 45;
  int EQUALCOMPARATOR = 46;
  int ORDERCOMPARATOR = 47;
  int CHAIN = 48;
  int LETTER = 49;
  int DIGIT = 50;

  int IN_TITLE = 0;
  int IN_COMMENT = 1;
  int DEFAULT = 2;

  String[] tokenImage = {
    "<EOF>",
    "<TITLE>",
    "\"gridsize\"",
    "\"drawgrid\"",
    "\"//\"",
    "\" \"",
    "\"\\t\"",
    "<ENDOFCOMMENT>",
    "<LANGUAGE>",
    "\"smallfont\"",
    "<EOL>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<INFO>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\"*\"",
    "\"=\"",
    "\",\"",
    "\";\"",
    "\"\\\'\"",
    "\"\\\"\"",
    "<LOGICALCONNECTOR>",
    "\"Node\"",
    "\"new\"",
    "\"delete\"",
    "<CREATELIST>",
    "<NULL>",
    "\"while\"",
    "\"for\"",
    "\"break\"",
    "\"if\"",
    "\"else\"",
    "\"redrawListHorizontally()\"",
    "<SP>",
    "<CHAR>",
    "<CHARLIST>",
    "<STRING>",
    "<INT>",
    "<REAL>",
    "<IDENTIFIER>",
    "<DEREFERENCEOP>",
    "<EQUALCOMPARATOR>",
    "<ORDERCOMPARATOR>",
    "<CHAIN>",
    "<LETTER>",
    "<DIGIT>",
  };

}