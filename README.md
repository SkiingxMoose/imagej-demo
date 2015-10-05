This is a demonstration project that I am using to learn to develop ImageJ plugins, 
and also to familiarize myself with Maven and JUnit.

Notes from ReadMe of Original/Template Project:
===============================================

This is a minimal Maven project implementing an ImageJ 1.x plugin

It is intended as an ideal starting point to develop new ImageJ 1.x plugins
in an IDE of your choice. You can even collaborate with developers using a
different IDE than you.

However you build the project, in the end you will have the ```.jar``` file
(called *artifact* in Maven speak) in the _target/_ subdirectory.

To copy the artifact into the correct place, you can call ```mvn
-Dimagej.app.directory=/path/to/Fiji.app/```. This will not only copy your
artifact, but also all the dependencies. Restart your ImageJ or call
*Help>Refresh Menus* to see your plugin in the menus.

Developing plugins in an IDE is convenient, especially for debugging. To
that end, the plugin contains a _main()_ method which sets the _plugins.dir_
system property (so that the plugin is added to the Plugins menu), starts
ImageJ, loads an image and runs the plugin. See also
[this page](fiji.sc/Debugging#Debugging_plugins_in_an_IDE_.28Netbeans.2C_IntelliJ.2C_Eclipse.2C_etc.29)
for information how Fiji makes it easier to debug in IDEs.

Since this project is intended as a starting point for your own
developments, it is in the public domain.
