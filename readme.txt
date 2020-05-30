README file for Enigma Applet V2.3
==================================

Several visitors to my Enigma Applet web site have requested a standalone 
version for use when not connected to the Internet. This package provides 
just such a standalone version.

Requirements
============

You must have a browser which supports Java version 1.1 or higher. If your 
browser lacks Java support but can handle plugins, you could try Sun's Java 
Plugin from...

    http://java.sun.com/products/plugin/ 

Installation
============

Pick a directory and unzip the enigma_j.zip file into it. 

Open up enigma_j_standalone.html in your browser and you should be ready to go.

Troubleshooting
===============

Most of the problems reported installing Version 1.0 are down to the following:-

1. The unzip program didnt expand the directory structure (should not be a 
   problem with applet version 2.3)

2. The unzip program only supports 8.3 character file names

3. The browser is not Java enabled.

For problem 3, see the Compatability chapter below.

Compatability
=============

Version 1.0 of the applet was written back in Java Development Kit (JDK) 1.0 
days so it had minimal compatability issues. Life is more complex these days 
(JDK 1.3). I have tried to steer clear of newer and API calls, so the applet 
SHOULD still be compatible with older browsers. Version 2.3 of the applet 
introduces Internationalisation support, which uses JDK 1.1 features, so 
JDK 1.0 is no longer supported.

I have tested the applet with the following browsers:-

Microsoft Internet Explorer 5.0
Netscape Communicator 4.06
Sun JDK 1.3 Applet Viewer

Changes between version 2.2 and version 2.3
===========================================
Added Internationalisaton support
Internationalisation code will prevent JDK 1.0 compatability

Changes between version 2.1 and version 2.2
===========================================
Fixed bug in bitmap paint logic when applet is used over a slow link

Changes between version 2.0 and version 2.1
===========================================
Fixed a bug in thumbwheel hit testing when used in bitmap mode on a 
3 rotor machine

Made position of indicator windows configurable via applet tag

Minor change to bitmap paint logic to attempt to correct layout bug when 
applet is used over a slow link

Changes between version 1.0 and version 2.0
===========================================
Machine and applet settings are now configurable via the HTML applet tag. See
the chapter below for more details.

The applet can now be used to animate a bitmap photographic image of a real 
Enigma. See the chapter below for more details.

The plain and cypher text display can now optionally be placed in a larger 
scrolling window to the right of the machine.

Plain and cypher text can optionally be displayed in 4 or 5 letter groups.

When using a bitmap image of a 4 rotor machine, the thumbwheels can be used.

It is no longer necessary to click on the applet before the keyboard can be 
used for input.

When changing between 3 and 4 rotor mode, the 3 'normal' rotors remain in 
place.

Applet settings, or just the number of rotors can be 'locked' via the HTML 
applet tag.

Applet Configuration
====================
Version 2.0 of the Enigma applet is fully configurable at startup time. 
Configuration options include the setup of the Enigma itself and a number of 
ways to customise the applet.

Enigma Settings
===============

<param name="Enigma.fourRotor" value="true">

true in this parameter sets the simulator to start in 4 rotor mode.

<param name="Enigma.wheel1.ringSetting" value="11">
<param name="Enigma.wheel2.ringSetting" value="11">
<param name="Enigma.wheel3.ringSetting" value="11">
<param name="Enigma.wheel4.ringSetting" value="11">
<param name="Enigma.wheel5.ringSetting" value="11">
<param name="Enigma.wheel6.ringSetting" value="11">
<param name="Enigma.wheel7.ringSetting" value="11">
<param name="Enigma.wheel8.ringSetting" value="11">
<param name="Enigma.wheelBeta.ringSetting" value="11">
<param name="Enigma.wheelGamma.ringSetting" value="11">

These set the ring settings on each of the rotors.

<param name="Enigma.fittedRotors" value="456">

This fits the specified 'normal' rotors to the machine

<param name="Enigma.thinRotor" value="gamma">

This fits the specified thin rotor to a 4 rotor machine. Values
are "beta" and "gamma"

<param name="Enigma.reflector" value="c">

This fits the specified reflector to the machine. Values are "b"
and "c"

<param name="Enigma.fittedSteckers" value="AB,CD">

This fits the specified steckers to the machine.

<param name="Enigma.indicator" value="BBBB">

This sets the initial indicator setting of the machine.


Applet Display
==============

<param name="EnigmaCard.layoutHorizontal" value="true">

Setting this to "true" causes the applet to use larger text windows for plain 
and cypher text, laid out to the right of the machine itself.

<param name="EnigmaCard.groupText" value="true">

This controls whether the applet uses 4 and 5 letter groups in the plain and 
cypher text windows or just writes the characters as a single block of text.

<param name="ConfigCard.lockAll" value="true">

Prevents the user from accessing the machine settings.

<param name="AdvancedConfigCard.lockRotorCount" value="true">

Prevents the user from changing between 3 and 4 rotor modes


Bitmap Image Support
====================

The applet can now be used to animate a bitmap photographic image of a real 
Enigma, provided that the image is taken 'face on' to the machine and has 
minimal perspective. The following settings allow the applet to be aligned with
the image.

<param name="EnigmaPicture.image" value="enigma.jpg">

Image file name

<param name="EnigmaPicture.lamps.x" value="70">
<param name="EnigmaPicture.lamps.y" value="209">

coordinates of top left corner of lamp board

<param name="EnigmaPicture.lamps.xSpacing" value="32.5">
<param name="EnigmaPicture.lamps.ySpacing" value="29">

lamp spacing

<param name="EnigmaPicture.lamps.offsetQ" value="11">
<param name="EnigmaPicture.lamps.offsetA" value="21">
<param name="EnigmaPicture.lamps.offsetP" value="0">

row offsets from left hand side for lampboard

<param name="EnigmaPicture.lamps.diameter" value="16">
<param name="EnigmaPicture.lamps.borderWidth" value="1">

size of lamps

<param name="EnigmaPicture.lamps.toneDownLampPercent" value="25">

Percentage by which bright colours (e.g. white) will be toned down on the lamp
images when lamps are not illuminated. Recommended values are 15 to 25%

<param name="EnigmaPicture.keys.x" value="72">
<param name="EnigmaPicture.keys.y" value="309">

coordinates of top left corner of keyboard

<param name="EnigmaPicture.keys.xSpacing" value="32.5">
<param name="EnigmaPicture.keys.ySpacing" value="29">

key spacing

<param name="EnigmaPicture.keys.offsetQ" value="10">
<param name="EnigmaPicture.keys.offsetA" value="20">
<param name="EnigmaPicture.keys.offsetP" value="0">

row offsets from left hand side of keyboard

<param name="EnigmaPicture.keys.diameter" value="16">
<param name="EnigmaPicture.keys.borderWidth" value="1">

size of keys

<param name="EnigmaPicture.keys.keyDownOffset" value="5">

distance by which key image is moved down to represent a depressed key.

<param name="EnigmaPicture.keys.extendY" value="2">

stretches bottom of (otherwise square) key image crop region downwards 
(used when painting a depressed key)

<param name="EnigmaPicture.thumb1X" value="124">
<param name="EnigmaPicture.thumb2X" value="157">
<param name="EnigmaPicture.thumb3X" value="193">
<param name="EnigmaPicture.thumb4X" value="230">
<param name="EnigmaPicture.thumbWidth" value="4">
<param name="EnigmaPicture.thumbHeight" value="87">
<param name="EnigmaPicture.thumbY" value="94">

location and size of thumbwheels				  

<param name="EnigmaPicture.indicatorX" value="99">
<param name="EnigmaPicture.indicatorY" value="141">
<param name="EnigmaPicture.indicatorSpacing" value="36">

location and spacing of the indicator windows. Note: for a 3 rotor machine,
you should add the spacing to the 'X' value to determine the true 'X' position
of the first window.

<param name="EnigmaPicture.traceHitTest" value="true">

debugging and alignment facility - will trace x and y coordinates to Java 
console window when the mouse is pressed.

<param name="About.extraCopyright" value="Image copyright scherbius.com 1939">

Allows image copyright message to be added to the 'About' box.

Multilingual Support
====================

<param name="LocaleCountry" value="de">
<param name="LocaleLanguage" value="de">
<param name="LocaleVariant" value="who knows?">

Allows the country and language to be specified. The variant should also work,
but I havent found an example to test with.

You will also need to look at 

ac/enigma/resources/EnigmaApplet.properties

- this file contains the default (English) values for the various field and 
button labels.

If you want to add a new language, create a file with the appropriate suffix 
(e.g. EnigmaApplet_de.properties) and include the appropriate values for the 
labels in the language.

Any values omitted from the language specific properties file will cause 
the default (English) value to be used.

If you do write a new language-specific properties file, please send it to
me and I will include it in the distribution.
