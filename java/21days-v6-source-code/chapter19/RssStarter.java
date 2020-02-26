import nu.xom.*;

public class RssStarter {
    public static void main(String[] arguments) {
        // create an <rss> element to serve as the document's root
        Element rss = new Element("rss");
        
        // add a version attribute to the element
        Attribute version = new Attribute("version", "2.0");
        rss.addAttribute(version);
        // create a <channel> element and make it a child of <rss>
        Element channel = new Element("channel");
        rss.appendChild(channel);
        // create the channel's <title>
        Element title = new Element("title");
        Text titleText = new Text("Workbench");
        title.appendChild(titleText);
        channel.appendChild(title);
        // create the channel's <link>
        Element link = new Element("link");
        Text linkText = new Text("http://www.cadenhead.org/workbench/");
        link.appendChild(linkText);
        channel.appendChild(link);
        
        // create a new document with <rss> as the root element
        Document doc = new Document(rss);
        
        // Display the XML document
        System.out.println(doc.toXML());
    }
}
