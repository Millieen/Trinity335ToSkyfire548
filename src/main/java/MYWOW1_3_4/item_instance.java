package MYWOW1_3_4;

public class item_instance {
    public static item_instance convert(TC335.item_instance oldinstance) {
        item_instance newinstance = new item_instance();
        newinstance.guid = oldinstance.guid;
        newinstance.itemEntry = oldinstance.itementry;
        newinstance.owner_guid = oldinstance.owner_guid==0?"NULL":String.valueOf(oldinstance.owner_guid);
        newinstance.creatorguid = oldinstance.creatorguid==0?"NULL":String.valueOf(oldinstance.creatorguid);
        newinstance.giftcreatorguid = oldinstance.giftcreatorguid==0?"NULL":String.valueOf(oldinstance.giftcreatorguid);
        newinstance.count = oldinstance.count;
        newinstance.duration = oldinstance.duration;
        newinstance.charges = oldinstance.charges;
        newinstance.flags = oldinstance.flags;
        newinstance.enchantments = oldinstance.enchantments;
        newinstance.randompropertyid = oldinstance.randompropertyid;
        newinstance.transmogrifyid = oldinstance.transmog;
        newinstance.durability = oldinstance.durability;
        newinstance.playedtime = oldinstance.playedtime;
        newinstance.text = oldinstance.text;
        return newinstance;
    }
    item_instance() {
        reforgeid = 0;
        upgradeid = 0;
    }

    int guid;
    int itemEntry;
    String owner_guid;
    String creatorguid;
    String giftcreatorguid;
    int count;
    int duration;
    String charges;
    int flags;
    String enchantments;
    int randompropertyid;
    int reforgeid;
    int transmogrifyid;
    int upgradeid;
    int durability;
    int playedtime;
    String text;

    public String to_sql() {
        String sql = "INSERT INTO `item_instance` VALUES (";
        sql += String.valueOf(guid);
        sql += ", ";
        sql += String.valueOf(itemEntry);
        sql += ", ";
        sql += owner_guid;
        sql += ", ";
        sql += creatorguid;
        sql += ", ";
        sql += giftcreatorguid;
        sql += ", ";
        sql += String.valueOf(count);
        sql += ", ";
        sql += String.valueOf(duration);
        sql += ", ";
        sql += charges;
        sql += ", ";
        sql += String.valueOf(flags);
        sql += ", ";
        sql += enchantments;
        sql += ", ";
        sql += String.valueOf(randompropertyid);
        sql += ", ";
        sql += String.valueOf(reforgeid);
        sql += ", ";
        sql += String.valueOf(transmogrifyid);
        sql += ", ";
        sql += String.valueOf(upgradeid);
        sql += ", ";
        sql += String.valueOf(durability);
        sql += ", ";
        sql += String.valueOf(playedtime);
        sql += ", ";
        sql += text;
        sql += ");";
        return sql;
    }
}
