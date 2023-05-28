package com.assignments.six;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class StudentXML {

	public static void main(String[] args) {
		try {
			File xmlFile = new File("student.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			// Create a handler to handle SAX events
			DefaultHandler handler = new DefaultHandler() {
				boolean idFlag = false;
				boolean nameFlag = false;
				boolean stdFlag = false;
				boolean genderFlag = false;
				boolean marksFlag = false;
				boolean addressFlag = false;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase("id")) {
						idFlag = true;
					} else if (qName.equalsIgnoreCase("name")) {
						nameFlag = true;
					} else if (qName.equalsIgnoreCase("std")) {
						stdFlag = true;
					} else if (qName.equalsIgnoreCase("gender")) {
						genderFlag = true;
					} else if (qName.equalsIgnoreCase("marks")) {
						marksFlag = true;
					} else if (qName.equalsIgnoreCase("address")) {
						addressFlag = true;
					}
				}

				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					if (idFlag) {
						System.out.println("ID: " + new String(ch, start, length));
						idFlag = false;
					} else if (nameFlag) {
						System.out.println("Name: " + new String(ch, start, length));
						nameFlag = false;
					} else if (stdFlag) {
						System.out.println("Standard: " + new String(ch, start, length));
						stdFlag = false;
					} else if (genderFlag) {
						System.out.println("Gender: " + new String(ch, start, length));
						genderFlag = false;
					} else if (marksFlag) {
						System.out.println("Marks: " + new String(ch, start, length));
						marksFlag = false;
					} else if (addressFlag) {
						System.out.println("Address: " + new String(ch, start, length));
						addressFlag = false;
					}
				}
			};

			saxParser.parse(xmlFile, handler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
