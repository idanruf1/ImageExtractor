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

For example, calling ImageExtractor with the arguments
http://techcrunch.com/
http://theradicalidea.wordpress.com
http://belleofthelibrary.com/
http://hippiecahier.com/
http://colleenbriggs.com/

Will all yield good results. (Some need CSS to be enabled).

 http://makeapowerfulpoint.com/ will work correctly if CSS is disabled, but will give the background texture if CSS is enabled.

Note that I made the pref.txt interface for human ease of use. For easier compatability with desired program, you can easily change main (which is in src/com/jimplush/goose/Main).

========

Required external jars:

	commons-io-2.4

	commons-lang-2.6

	commons--logging-1.1.3
	
	httpclient-4.2.5

	httpcore-4.4.4

	jsoup-1.7.2

	log4j-1.2.17

	slf4j-api-1.7.5

	sl4fj-log4j12-1.7.5