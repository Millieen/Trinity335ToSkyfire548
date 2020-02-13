package TC335;

public class item_instance {
    public item_instance(String[] indata) {
        guid = Integer.parseInt(indata[0]);
        itementry = Integer.parseInt(indata[1]);
        owner_guid = Integer.parseInt(indata[2]);
        creatorguid = Integer.parseInt(indata[3]);
        giftcreatorguid = Integer.parseInt(indata[4]);
        count = Integer.parseInt(indata[5]);
        duration = Integer.parseInt(indata[6]);
        charges = indata[7];
        flags = Integer.parseInt(indata[8]);
        enchantments = indata[9];
        randompropertyid = Integer.parseInt(indata[10]);
        durability = Integer.parseInt(indata[11]);
        playedtime = Integer.parseInt(indata[12]);
        text = indata[13];
        transmog = Integer.parseInt(indata[14]);
    }
    public int guid;
    public int itementry;
    public int owner_guid;
    public int creatorguid;
    public int giftcreatorguid;
    public int count;
    public int duration;
    public String charges;
    public int flags;
    public String enchantments;
    public int randompropertyid;
    public int durability;
    public int playedtime;
    public String text;
    public int transmog;
}
