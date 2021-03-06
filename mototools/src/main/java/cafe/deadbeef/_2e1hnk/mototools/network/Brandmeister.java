package cafe.deadbeef._2e1hnk.mototools.network;

import cafe.deadbeef._2e1hnk.mototools.radioprofiles.RadioProfile;

public class Brandmeister extends AbstractNetwork {
	public Brandmeister(RadioProfile radioProfile) {
		super(radioProfile);
		
		//this.roamNamePattern.put(91, "Worldwide");  // Not used in Brandmeister
		
		/* Add Talkgroups
		 * 
		 * arguments are:
		 * 
		 * 		int		timeslot (1/2)
		 * 		int		talkgroup number
		 * 		String	channel name
		 * 		boolean	is this a calling channel? (Will be annotated with '*')
		 * 		boolean add this channel to the scan list? (note: maximum of 16 channels on the scan list)
		 * 		boolean enable ARS on this channel?
		 */
		
		this.addTalkgroup(1, 91, "Worldwide", false, true, true);
		this.addTalkgroup(1, 92, "Europe", false, true, true);
		this.addTalkgroup(1, 93, "USA", false, true, true);
		this.addTalkgroup(1, 9, "Local", false, true, true);
		this.addTalkgroup(2, 9, "Reflectors", false, true, true);
		this.addTalkgroup(2, 9990, "Echo Test", false, true, false);
		this.addTalkgroup(1, 9990, "Echo Test", false, true, false);
		
		// Add Monitor Talkgroups
		this.addMonitorTalkgroup(2, 9, "Reflectors", false, true);
		
		// Add Reflectors
		this.addReflector(4000, "Unlink");
		this.addReflector(4001, "Berlin-Brandenberg");
		this.addReflector(4011, "Celle-Heide");
		this.addReflector(4016, "Berlin-Brandenberg");
		this.addReflector(4020, "Niedersachsen Mitte");
		this.addReflector(4060, "CHE/DEU");
		this.addReflector(4061, "CHE/FRA");
		this.addReflector(4062, "CHE/ITA");
		this.addReflector(4063, "Bern/Solothurn");
		this.addReflector(4064, "Basel");
		this.addReflector(4200, "Ukraine");
		this.addReflector(4202, "UA/XRF255B");
		this.addReflector(4204, "UA/DCS002B");
		this.addReflector(4214, "Spain");
		this.addReflector(4232, "Austria");
		this.addReflector(4250, "Italy");
		this.addReflector(4251, "Italy Zn1");
		this.addReflector(4252, "Italy Zn2");
		this.addReflector(4253, "Italy Zn3");
		this.addReflector(4254, "Italy Zn4");
		this.addReflector(4255, "Italy Zn5");
		this.addReflector(4256, "Italy Zn6");
		this.addReflector(4257, "Italy Zn7");
		this.addReflector(4258, "Italy Zn8");
		this.addReflector(4259, "Italy Zn9");
		this.addReflector(4260, "Italy Zn0");
		this.addReflector(4262, "Germany");
		this.addReflector(4270, "Czech");
		this.addReflector(4280, "Poland");
		this.addReflector(4281, "Poland Tech");
		this.addReflector(4290, "Bulgaria");
		this.addReflector(4300, "FR0");
		this.addReflector(4301, "FR1 Med");
		this.addReflector(4302, "FR2 Alps");
		this.addReflector(4303, "FR3 Pyrenees");
		this.addReflector(4304, "FR4 Est");
		this.addReflector(4305, "FR5 Ouest");
		this.addReflector(4306, "FR6 Atlantique");
		this.addReflector(4307, "FR7 Nord");
		this.addReflector(4308, "FR8 Centre");
		this.addReflector(4309, "FR9 DOM-TOM");
		this.addReflector(4310, "FR10 Ile-de-France");
		this.addReflector(4316, "FR/DCS033C");
		this.addReflector(4317, "FR/XRF067C");
		this.addReflector(4326, "Canada Eng");
		this.addReflector(4327, "Canade Fra");
		this.addReflector(4370, "Spain");
		this.addReflector(4371, "Spain Latin");
		this.addReflector(4400, "UK");
		this.addReflector(4401, "UK Chat 1");
		this.addReflector(4402, "UK Chat 2");
		this.addReflector(4403, "UK Chat 3");
		this.addReflector(4404, "Ireland");
		this.addReflector(4405, "Scotland");
		this.addReflector(4407, "Wales");
		this.addReflector(4409, "Cornwall");
		this.addReflector(4410, "SW England");
		this.addReflector(4411, "SE England");
		this.addReflector(4412, "NW England");
		this.addReflector(4414, "Irl Chat");
		this.addReflector(4415, "Scot Chat");
		this.addReflector(4416, "NE England");
		this.addReflector(4417, "Wales Chat");
		this.addReflector(4418, "W Midlands");
		this.addReflector(4419, "E Midlands");
		this.addReflector(4420, "Wires-X");
		this.addReflector(4426, "Allstar");
		this.addReflector(4433, "DE/XRF433B");
		this.addReflector(4500, "Nederland");
		this.addReflector(4501, "Ned Noord");
		this.addReflector(4502, "Ned Midden");
		this.addReflector(4503, "Ned Zuid");
		this.addReflector(4504, "Ned Oost");
		this.addReflector(4636, "Mi5 State1");
		this.addReflector(4637, "Mi5 State2");
		this.addReflector(4638, "Mi5 Event");
		this.addReflector(4639, "USA");
		this.addReflector(4640, "USA Area 0");
		this.addReflector(4641, "USA Area 1");
		this.addReflector(4642, "USA Area 2");
		this.addReflector(4643, "USA Area 3");
		this.addReflector(4644, "USA Area 4");
		this.addReflector(4645, "USA Area 5");
		this.addReflector(4646, "USA Area 6");
		this.addReflector(4647, "USA Area 7");
		this.addReflector(4648, "USA Area 8");
		this.addReflector(4649, "USA Area 9");
		this.addReflector(4650, "Sweden SM0");
		this.addReflector(4651, "Sweden SM1");
		this.addReflector(4652, "Sweden SM2");
		this.addReflector(4653, "Sweden SM3");
		this.addReflector(4654, "Sweden SM4");
		this.addReflector(4655, "Sweden SM5");
		this.addReflector(4656, "Sweden SM6");
		this.addReflector(4657, "Sweden SM7");
		this.addReflector(4659, "Sweden All");
		this.addReflector(4700, "Denmark");
		this.addReflector(4701, "DK Nordjylland");
		this.addReflector(4702, "DK Midtjylland");
		this.addReflector(4703, "DK Syddanmark");
		this.addReflector(4704, "Copenhagen DK");
		this.addReflector(4705, "Sjaelland DK");
		this.addReflector(4710, "Portugal 1");
		this.addReflector(4711, "Portugal 2");
		this.addReflector(4712, "PRT DSTAR");
		this.addReflector(4750, "Belgium");
		this.addReflector(4751, "BEL Vlaams");
		this.addReflector(4752, "BEL French");
		this.addReflector(4753, "BEL German");
		this.addReflector(4790, "TG334 XE");
		this.addReflector(4791, "TG3341 XE1");
		this.addReflector(4792, "TG3342 XE2");
		this.addReflector(4793, "TG3343 XE3");
		this.addReflector(4799, "XE Experimental");
		this.addReflector(4805, "Australia");
		this.addReflector(4806, "VK5 XRF500D");
		this.addReflector(4850, "DE/XRF850B");
		this.addReflector(4860, "Norway");
		this.addReflector(4990, "Test Ref 1");
		this.addReflector(4991, "Test Ref 2");
		this.addReflector(4992, "Test Ref 3");
		this.addReflector(4993, "Test Ref 4");
		this.addReflector(4999, "Extend Routing");
		this.addReflector(5000, "Status");
		this.addReflector(234999, "APRS");
	}
}
