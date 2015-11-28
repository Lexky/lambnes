# Version History #

|version number|details|
|:-------------|:------|
|0.0.1         |initial release|
|0.0.2         |fixed command line rom loading issues. I think.|
|0.0.3         |improved ppu functioning. Sprite flickering fixed. Working toward accurate ppu timing|
|0.0.4         |ppu timing improved. Some issues with sprites and background images corrected.|
|0.0.5         |scrolling implemented. DMA improved. Some commands on the CPU fixed. Sound stubbed in a little bit.|
|0.0.6         |vram +32 increment impolemented. Problem with memory mirroring between sprite and image palettes corrected. Problem with background color seemingly corrected. Initial work on sound. Sound remains nonfunctional.|
|0.0.7         |switched over to a spring based design. Some work done on APU, although it remains silent. Implemented MMC1 mapper and Unrom mapper, allowing several new games to be tested. Corrected error with vertical scroll during which sprites could be overwritten by background tiles.|
|0.0.8         |Implemented 8x16 sprites. Corrected some issues with MMC1 mapper that caused some issues with name tables being overwritten with bad values. Also improved speed of the code and implemented rudimentary frame limiting logic.|
|0.0.9         |fixed issue with display of 8x16 sprites. Corrected some issues with MMC3 mapper.|