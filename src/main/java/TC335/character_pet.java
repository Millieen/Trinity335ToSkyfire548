package TC335;

public class character_pet {
    public character_pet(String[] indata) {
        id = Integer.parseInt(indata[0]);
        entry = Integer.parseInt(indata[1]);
        owner = Integer.parseInt(indata[2]);
        modelid = Integer.parseInt(indata[3]);
        createdbyspell = Integer.parseInt(indata[4]);
        pettype = Integer.parseInt(indata[5]);
        level = Integer.parseInt(indata[6]);
        exp = Integer.parseInt(indata[7]);
        reactstate = Integer.parseInt(indata[8]);
        name = indata[9];
        renamed = Integer.parseInt(indata[10]);
        slot = Integer.parseInt(indata[11]);
        curhelth = Integer.parseInt(indata[12]);
        curmana = Integer.parseInt(indata[13]);
        curhappiness = Integer.parseInt(indata[14]);
        savetime = Integer.parseInt(indata[15]);
        abdata = indata[16];
    }
    public int id;
    public int entry;
    public int owner;
    public int modelid;
    public int createdbyspell;
    public int pettype;
    public int level;
    public int exp;
    public int reactstate;
    public String name;
    public int renamed;
    public int slot;
    public int curhelth;
    public int curmana;
    public int curhappiness;
    public int savetime;
    public String abdata;
}
