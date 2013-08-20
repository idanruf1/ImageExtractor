ImageExtractor
==============

In order to start ImageExtractor you need to have a file named pref.txt in the same directory, with 5 lines:
	The first line should be the path where the program can save temp images and possible save the result image if specify so. This must be a location with a writing permission (e.g. MyDocuments and not C:/Program Files).
	The second line should be the path where your ImageMagick is located. Make sure that the programs 'identify' and 'convert' are in that directory.
	The third line should be "save=true" if you want to save the result image or webpage, and "save=false" otherwise.
	The fourth line should be "all=true" if you wish to try all possible images, even ones that are probably bad candidates, and "all=false" otherwise.
	The fifth line should be "css=true" if you wish to also look for images hidden in the css (and favor them over other images).

You can run the program using
	java -jar ImageExtractor.jar http://example.com
from the command line where the argument is the webpage to look for the image in.