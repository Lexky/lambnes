# Introduction #

general instructions on installation and use of the lambnes software

# Details #

If all has gone well, the jar is self-executing, containing all source and dependencies.

download either the lambnes binaries tarfile or zipfile and extract. Inside the lambnes folder you will see the following directory structure:
```
lambnes/
  lambnes.jar
  config/
  lib/
  roms/
```

At this time lambnes only loads roms from the command prompt. By default, lambnes initially looks in the roms/ folder for roms that might be loadable. If multiple roms are found it will list them to the user from the command prompt and will load the rom indicated by the user. If only one rom is found in the default roms folder it will load that rom. The default folder is configurable based on the lambnes config.properties file.

Alternatively, you can supply a directory or a rom at the command prompt.

so, for instance, if you execute
`java -jar lambnes.jar /path/to/rom.zip`
rom.zip will attempt to be loaded, while if you execute
`java -jar lambnes.jar`
the default folder (by default this is the roms/ folder) will be examined for roms.

At this time, this is the key mapping:<br />
W: up<br />
A: left<br />
D: right<br />
X: down<br />
J: A<br />
K: B<br />
esc: select<br />
enter: start<br />
There are plans to implement the ability to customize key mapping.