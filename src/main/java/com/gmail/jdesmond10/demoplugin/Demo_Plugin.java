package com.gmail.jdesmond10.demoplugin;
/*
 * To the extent possible under law, the Fiji developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

/**
 * DemoPlugin
 *
 * Special thanks to The Fiji Team for providing the template for development.
 * See https://github.com/imagej/minimal-ij1-plugin for the template this
 * plug-in was based off.
 */
public class Demo_Plugin implements PlugIn {

	public void showAbout() {
		IJ.showMessage("ProcessPixels",
				"a template for processing each pixel of an image");
	}

	/**
	 * Main method for debugging.
	 *
	 * For debugging, it is convenient to have a method that starts ImageJ and
	 * includes the plugin in its configuration.
	 *
	 * @param args
	 *            unused
	 * @author The Fiji Team
	 */
	public static void main(final String[] args) {
		// set the plugins.dir property to make the plugin appear in the Plugins
		// menu
		final Class<?> clazz = Demo_Plugin.class;
		final String url = clazz.getResource(
				"/" + clazz.getName().replace('.', '/') + ".class").toString();
		final String pluginsDir = url.substring(5, url.length()
				- clazz.getName().length() - 6);
		System.setProperty("plugins.dir", pluginsDir);

		// start ImageJ
		new ImageJ();
	}

	@Override
	/**
	 * Runs the plugin. Is called whenever the plugin is launched through menus.
	 */
	public void run(final String arg) {

		IJ.showMessage("Hello World");
	}
}
