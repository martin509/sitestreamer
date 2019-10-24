package websiteTranscriber;

import StreamerAndInterpreter.ScrubUtils;
import StreamerAndInterpreter.SourceReader;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Template templateRead = new Template();
		System.out.println(templateRead.toString());
		
		SourceReader reader = new SourceReader(templateRead);
		//reader.followLinks();
		/*String examplePara = "		<div class=\"chapter-content\">\r\n" + 
				"			<html><head></head><body><p class=\"intro-p\">Every modification made to Juan Selguero�s 1978 Honda Civic has been thoroughly considered. And despite what you might think at first glance, a<em> lot</em> has been done � Juan is a master of detail.</p>\r\n" + 
				"<p><a href=\"https://www.instagram.com/78b18cvcc/\" target=\"_blank\">Juan</a> got the classic Honda hatchback from his grandmother when he was 16 years old, but it took almost a decade before he decided to build it up into something special. With an idea in mind, and at age 25 a stable income, he was finally able see the project through.</p>\r\n" + 
				"<figure><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162351/Speedhunters_Juan-Selguardos-garage-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Juan-Selguardos-garage-Civic-1978\" data-attachment-id=\"455075\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162351/Speedhunters_Juan-Selguardos-garage-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_juan-selguardos-garage-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162351/Speedhunters_Juan-Selguardos-garage-Civic-1978-1200x800.jpg\"></figure><p>We�ll start with the bodywork � now finished in a Lexus gray � where perhaps only a trained eye will pick up on the fenders having been widened 1.5 inches in the front and 3 inches at the back. This was all by Juan�s design; he needed more room to run a larger and wider wheel and tire package, but also wanted to keep the body looking as stock as possible. Bolt-on flares just wouldn�t have had the same effect.</p>\r\n" + 
				"<p>Initially Juan had CCW wheels fitted, but earlier this year he swapped those out for a set of refinished Mugen MR5s, which look superb wrapped up Nankang AR-1 semi-slicks.</p>\r\n" + 
				"<ul class=\"image-gallery\"><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind-680x453.jpg\" alt=\"Speedhunters_Civic-1978-from-behind\" data-attachment-id=\"455067\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_civic-1978-from-behind/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind-1200x800.jpg\"></div></li><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Left-side-Civic-1978\" data-attachment-id=\"455076\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_left-side-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978-1200x800.jpg\"></div></li></ul><p>In �78, the USDM Civic came with huge safety bumpers complete with appalling plastic extensions at each corner. The �75 model bumpers that Juan�s running now are far less offensive and fit much closer to the body through some custom modifications.</p>\r\n" + 
				"<figure><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162342/Speedhunters_Integra-Engine-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Integra-Engine-Civic-1978\" data-attachment-id=\"455073\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162342/Speedhunters_Integra-Engine-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_integra-engine-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162342/Speedhunters_Integra-Engine-Civic-1978-1200x800.jpg\"></figure><p>A moment ago we mentioned the need for bigger wheels and more rubber on the road, and here�s why.</p>\r\n" + 
				"<p>The B18C1 engine came from a �98 Honda Integra, but has since been upgraded with an Edelbrock Victor X intake manifold and custom short intake pipe among other modifications. According to Juan, a lot of work went into setting up the engine bay for the B-series swap, but the fit and finish is so good you�d be forgiven for thinking it was factory.</p>\r\n" + 
				"<figure><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162325/Speedhunters_Civic-1978-left-behind-680x453.jpg\" alt=\"Speedhunters_Civic-1978-left-behind\" data-attachment-id=\"455069\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162325/Speedhunters_Civic-1978-left-behind.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_civic-1978-left-behind/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162325/Speedhunters_Civic-1978-left-behind-1200x800.jpg\"></figure><p>With 216whp in a car that weighs not much more than 1,400lb (635kg), the little Civic is quick. Thanks to BC Racing coilovers and a NSX brake swap up front, it handles and stops well, too.</p>\r\n" + 
				"<ul class=\"image-gallery\"><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162405/Speedhunters_Steering-Wheel-of-Civic-680x453.jpg\" alt=\"Speedhunters_Steering-Wheel-of-Civic\" data-attachment-id=\"455078\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162405/Speedhunters_Steering-Wheel-of-Civic.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_steering-wheel-of-civic/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162405/Speedhunters_Steering-Wheel-of-Civic-1200x800.jpg\"></div></li><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162334/Speedhunters_Honda-Civic-1978-interior-680x453.jpg\" alt=\"Speedhunters_Honda-Civic-1978-interior\" data-attachment-id=\"455071\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162334/Speedhunters_Honda-Civic-1978-interior.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_honda-civic-1978-interior/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162334/Speedhunters_Honda-Civic-1978-interior-1200x800.jpg\"></div></li></ul><figure><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162408/Speedhunters_Terminator-gear-stick-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Terminator-gear-stick-Civic-1978\" data-attachment-id=\"455079\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162408/Speedhunters_Terminator-gear-stick-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_terminator-gear-stick-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162408/Speedhunters_Terminator-gear-stick-Civic-1978-1200x800.jpg\"></figure><p>The interior has been completely refreshed, but mostly in factory style to maintain its originality. There are a couple of parts that tell a different story though: the K-Tuned billet shifter and AEM Electronics air/fuel ratio gauge. It�s a beautiful juxtaposition.</p>\r\n" + 
				"<figure><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162346/Speedhunters_Juan-Selguardo-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Juan-Selguardo-Civic-1978\" data-attachment-id=\"455074\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162346/Speedhunters_Juan-Selguardo-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_juan-selguardo-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162346/Speedhunters_Juan-Selguardo-Civic-1978-1200x800.jpg\"></figure><p>Riding with Juan, the Civic scrambles for traction through to third gear, so a firm grip on the steering wheel is required. The acceleration is striking, and it comes as no surprise that Juan has fun dusting Porsches, Lamborghinis and Ferraris on the streets of Los Angeles.</p>\r\n" + 
				"<p>Juan set out to build what in his eyes is the<em> perfect</em> first-gen Civic, and it�s hard to argue with what he�s created. The glint in his eye as we cruised around LA tells us it was all worth it, too.</p>\r\n" + 
				"<p><strong>Peter Edenberg</strong><br>\r\n" + 
				"Instagram: <a href=\"https://www.instagram.com/thefascinatingcars/\" target=\"_blank\">thefascinatingcars</a><br>\r\n" + 
				"Facebook: <a href=\"https://www.facebook.com/fascinatingcars/\" target=\"_blank\">fascinatingcars</a><br><a href=\"http://www.fascinatingcars.se/\" target=\"_blank\" data-saferedirecturl=\"https://www.google.com/url?q=http://www.fascinatingcars.se&amp;source=gmail&amp;ust=1568930110095000&amp;usg=AFQjCNHssVlqnBtOnCt2GWGok_mpSQY3qA\">www.fascinatingcars.se</a></p>\r\n" + 
				"<p>Additional Words &amp; Edit by <strong>Brad Lord</strong></p>\r\n" + 
				"<p><a href=\"http://www.speedhunters.com/tag/iamthespeedhunter/\" target=\"_blank\">More <strong>IAMTHESPEEDHUNTER</strong></a></p>\r\n" + 
				"<p><strong>How To join the IATS program:</strong> We have always welcomed readers to contact us with examples of their work and believe that the best Speedhunter is always the person closest to the culture itself, right there on the street or local parking lot. If you think you have what it takes and would like to share your work with us then you should apply to become part of the IAMTHESPEEDHUNTER program.<br><a href=\"http://www.speedhunters.com/2018/02/the-return-of-iamthespeedhunter/\" target=\"_blank\">Read how to get involved here</a>.</p></body></html>\r\n" + 
				"		</div>\r\n" + 
				"	</div>";
		System.out.println(ScrubUtils.scrubParagraph(examplePara));
		examplePara = "<ul class=\"image-gallery\"><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind-680x453.jpg\" alt=\"Speedhunters_Civic-1978-from-behind\" data-attachment-id=\"455067\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_civic-1978-from-behind/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162316/Speedhunters_Civic-1978-from-behind-1200x800.jpg\"></div></li><li class=\"image-row images-2\"><div class=\"gallery-single-image\"><img class=\"alignnone\" src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978-680x453.jpg\" alt=\"Speedhunters_Left-side-Civic-1978\" data-attachment-id=\"455076\" data-go-fullscreen=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978.jpg\" data-can-print=\"true\" data-attachment-url=\"http://www.speedhunters.com/2019/09/subtle-is-everything-in-a-b18-swapped-78-civic/speedhunters_left-side-civic-1978/\" data-src=\"http://speedhunters-wp-production.s3.amazonaws.com/wp-content/uploads/2019/09/18162355/Speedhunters_Left-side-Civic-1978-1200x800.jpg\"></div></li></ul><p>In �78, the USDM Civic came with huge safety bumpers complete with appalling plastic extensions at each corner. The �75 model bumpers that Juan�s running now are far less offensive and fit much closer to the body through some custom modifications.</p>"; 
		System.out.println(examplePara.split("<div").length - examplePara.split("</div>").length);*/
		System.out.println(reader.loadText());
	}

}