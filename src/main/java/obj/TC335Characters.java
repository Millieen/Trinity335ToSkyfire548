package obj;

public class TC335Characters {

    public TC335Characters(String[] indata) {
        guid = Integer.parseInt(indata[0]);
        account = Integer.parseInt(indata[1]);
        name = indata[2];
        race = Integer.parseInt(indata[3]);
        i_class = Integer.parseInt(indata[4]);
        gender = Integer.parseInt(indata[5]);
        level = Integer.parseInt(indata[6]);
        xp = Integer.parseInt(indata[7]);
        money = Integer.parseInt(indata[8]);
        skin = Integer.parseInt(indata[9]);
        face = Integer.parseInt(indata[10]);
        hairstyle = Integer.parseInt(indata[11]);
        haircolor = Integer.parseInt(indata[12]);
        facialstyle = Integer.parseInt(indata[13]);
        bankslots = Integer.parseInt(indata[14]);
        reststate = Integer.parseInt(indata[15]);
        playerflags = Integer.parseInt(indata[16]);
        pos_x = Double.parseDouble(indata[17]);
        pos_y = Double.parseDouble(indata[18]);
        pos_z = Double.parseDouble(indata[19]);
        map = Integer.parseInt(indata[20]);
        instance_id = Integer.parseInt(indata[21]);
        instance_mode_mask = Integer.parseInt(indata[22]);
        orientation = Double.parseDouble(indata[23]);
        taximask = indata[24];
        online = Integer.parseInt(indata[25]);
        cinematic = Integer.parseInt(indata[26]);
        totaltime = Integer.parseInt(indata[27]);
        leveltime = Integer.parseInt(indata[28]);
        logout_time = Integer.parseInt(indata[29]);
        is_logout_resting = Integer.parseInt(indata[30]);
        rest_bonus = Double.parseDouble(indata[31]);
        resettalents_cost = Integer.parseInt(indata[32]);
        resettalents_time = Integer.parseInt(indata[33]);
        trans_x = Double.parseDouble(indata[34]);
        trans_y = Double.parseDouble(indata[35]);
        trans_z = Double.parseDouble(indata[36]);
        trans_o = Double.parseDouble(indata[37]);
        transguid = Integer.parseInt(indata[38]);
        extra_flags = Integer.parseInt(indata[39]);
        stable_slots = Integer.parseInt(indata[40]);
        at_login = Integer.parseInt(indata[41]);
        zone = Integer.parseInt(indata[42]);
        death_expire_time = Integer.parseInt(indata[43]);
        taxi_path = indata[44];
        arenaPoints = Integer.parseInt(indata[45]);
        totalHonorPoints = Integer.parseInt(indata[46]);
        todayHonorPoints = Integer.parseInt(indata[47]);
        yesterdayHonorPoints = Integer.parseInt(indata[48]);
        totalkills = Integer.parseInt(indata[49]);
        todaykills = Integer.parseInt(indata[50]);
        yesterdaykills = Integer.parseInt(indata[51]);
        chosentitle = Integer.parseInt(indata[52]);
        knowncurrencies = Integer.parseInt(indata[53]);
        watchedfaction = Long.parseLong(indata[54]);
        drunk = Integer.parseInt(indata[55]);
        health = Integer.parseInt(indata[56]);
        power1 = Integer.parseInt(indata[57]);
        power2 = Integer.parseInt(indata[58]);
        power3 = Integer.parseInt(indata[59]);
        power4 = Integer.parseInt(indata[60]);
        power5 = Integer.parseInt(indata[61]);
        power6 = Integer.parseInt(indata[62]);
        power7 = Integer.parseInt(indata[63]);
        latency = Integer.parseInt(indata[64]);
        talentgroupscount = Integer.parseInt(indata[65]);
        activetalentgroup = Integer.parseInt(indata[66]);
        exploredzones = indata[67];
        equipmentcache = indata[68];
        ammoid = Integer.parseInt(indata[69]);
        knowntitles = indata[70];
        actionbars = Integer.parseInt(indata[71]);
        grantablelevels = Integer.parseInt(indata[72]);
        deleteinfos_acount = indata[73];
        deelteinfos_name = indata[74];
        deletedate = indata[75];
    }

    int guid;
    int account;
    String name;

    int race;
    int i_class;
    int gender;
    int level;
    int xp;
    int money;

    int skin;
    int face;
    int hairstyle;
    int haircolor;
    int facialstyle;
    int bankslots;
    int reststate;

    int playerflags;
    double pos_x;
    double pos_y;
    double pos_z;
    int map;
    int instance_id;

    int instance_mode_mask;

    double orientation;
    String taximask;
    int online;
    int cinematic;
    int totaltime;
    int leveltime;
    int logout_time;
    int is_logout_resting;
    double rest_bonus;
    int resettalents_cost;
    int resettalents_time;

    double trans_x;
    double trans_y;
    double trans_z;
    double trans_o;
    int transguid;
    int extra_flags;
    int stable_slots;
    int at_login;
    int zone;
    int death_expire_time;
    String taxi_path;

    int arenaPoints;
    int totalHonorPoints;
    int todayHonorPoints;
    int yesterdayHonorPoints;

    int totalkills;
    int todaykills;
    int yesterdaykills;
    int chosentitle;
    int knowncurrencies;
    long watchedfaction;
    int drunk;
    int health;
    int power1;
    int power2;
    int power3;
    int power4;
    int power5;

    int power6;
    int power7;
    int latency;
    int talentgroupscount;
    int activetalentgroup;
    String exploredzones;
    String equipmentcache;

    int ammoid;

    String knowntitles;
    int actionbars;
    int grantablelevels;
    String deleteinfos_acount;
    String deelteinfos_name;
    String deletedate;
}
