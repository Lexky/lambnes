# Introduction #
palette.xml is an xml document that describes the master palette used by the NES. Once the lambnes system is started it loads this document and all subsequent calls for color refer back to what was loaded from palette.xml.


# Details #
The NES master palette holds 64 colors that are referred to by the sprite palette and background palette. The palette.xml document describes 64 separate colors that are subsequently loaded into the system and used as the master palette.

The basic structure of a color entry is like this:<br>
<code>&lt;color red="75" green="75" blue="75" /&gt;</code><br>
each of the attributes describes an 8 bit hexadecimal value.<br>
<br>
The color palette used was taken from Patrick Diskin's Nintendo Entertainment System Documentation.