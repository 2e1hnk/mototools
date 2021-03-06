package cafe.deadbeef._2e1hnk.mototools.network;

public class Talkgroup {
	public int slot = 1;
	public int talkGroupId = 0;
	public String talkGroupName = null;
	public boolean enableArs = false;
	public boolean addToScanList = false;
	public boolean roamingTalkgroup = false;
	
	public Talkgroup() {
		
	}
	
	public Talkgroup(int slot, int id, String name, boolean enableArs, boolean addToScanList) {
		this(slot, id, name, enableArs, addToScanList, false);
	}
	public Talkgroup(int slot, int id, String name, boolean enableArs, boolean addToScanList, boolean roamingTalkgroup) {
		this.slot = slot;
		this.talkGroupId = id;
		this.talkGroupName = name;
		this.enableArs = enableArs;
		this.addToScanList = addToScanList;
		this.roamingTalkgroup = roamingTalkgroup;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public int getTalkGroupId() {
		return talkGroupId;
	}

	public void setTalkGroupId(int talkGroupId) {
		this.talkGroupId = talkGroupId;
	}

	public String getTalkGroupName() {
		return talkGroupName;
	}

	public void setTalkGroupName(String talkGroupName) {
		this.talkGroupName = talkGroupName;
	}

	public boolean isEnableArs() {
		return enableArs;
	}

	public void setEnableArs(boolean enableArs) {
		this.enableArs = enableArs;
	}

	public boolean isAddToScanList() {
		return addToScanList;
	}

	public void setAddToScanList(boolean addToScanList) {
		this.addToScanList = addToScanList;
	}

	public boolean isRoamingTalkgroup() {
		return roamingTalkgroup;
	}

	public void setRoamingTalkgroup(boolean roamingTalkgroup) {
		this.roamingTalkgroup = roamingTalkgroup;
	}
	
	
}
