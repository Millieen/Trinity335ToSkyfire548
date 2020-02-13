package TC335;

public class character_aura {
    public character_aura(String[] indata) {
        guid = Integer.parseInt(indata[0]);
        casterguid = Integer.parseInt(indata[1]);
        itemguid = Long.parseLong(indata[2]);
        spell = Integer.parseInt(indata[3]);
        effectmask = Integer.parseInt(indata[4]);
        recalculatemask = Integer.parseInt(indata[5]);
        stackcount = Integer.parseInt(indata[6]);
        amount0 = Integer.parseInt(indata[7]);
        amount1 = Integer.parseInt(indata[8]);
        amount2 = Integer.parseInt(indata[9]);
        base_amount0 = Integer.parseInt(indata[10]);
        base_amount1 = Integer.parseInt(indata[11]);
        base_amount2 = Integer.parseInt(indata[12]);
        maxduration = Integer.parseInt(indata[13]);
        remaintime = Integer.parseInt(indata[14]);
        remaincharges = Integer.parseInt(indata[15]);
        critchance = Double.parseDouble(indata[16]);
        applyresilience = Integer.parseInt(indata[17]);
    }
    public int guid;
    public int casterguid;
    public long itemguid;
    public int spell;
    public int effectmask;
    public int recalculatemask;
    public int stackcount;
    public int amount0;
    public int amount1;
    public int amount2;
    public int base_amount0;
    public int base_amount1;
    public int base_amount2;
    public int maxduration;
    public int remaintime;
    public int remaincharges;
    public double critchance;
    public int applyresilience;
}
