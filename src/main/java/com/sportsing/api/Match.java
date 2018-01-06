package com.sportsing.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Beskriver en match.
 * sport: Vilken sport det handlar om
 * contenders: En lista med resultat f�r varje deltagare
 * 
 *  registerContender(): Anv�nds p� serversidan f�r att l�gga till ContenderResults
 *  getContenderIterator(): Anv�nds p� klientsidan f�r att accessa listan med ContenderResults
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Match {
	@XmlElement
	private int id;
	@XmlElement
	private String sport;

	@XmlElementWrapper(name="contenders")
	@XmlElement(name="contender")
	private List<ContenderResult> contenders;

	public Match() {}
	public Match(int id, String sport) {
		this.id = id;
		this.sport = sport;
		contenders = new ArrayList<ContenderResult>();
	}
	public void registerContender(ContenderResult cr) {
		contenders.add(cr);
	}
	public void registerContender(String name, float score, int place) {
		registerContender(new ContenderResult(name, score, place));
	}

	public int getId() { return id; }
	public String getSport() { return sport; }
	public void setSport(String sport) { this.sport = sport; }
	public List<ContenderResult> getContenders() { return contenders; }
}
