package MYWOW1_3_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class account {
    public static account convert(TC335.account oldaccount) {
        account newaccount = new account();
        newaccount.id = oldaccount.id;
        newaccount.username = oldaccount.username;
        newaccount.sha_pass_hash = oldaccount.sha_pass_hash;
        newaccount.sessionkey = oldaccount.sessionkey;
        newaccount.v = oldaccount.v;
        newaccount.s = oldaccount.s;
        newaccount.reg_mail = oldaccount.reg_mail;
        newaccount.token_key = oldaccount.totp_secret;
        newaccount.email = oldaccount.email;
        newaccount.joindate = oldaccount.joindate;
        newaccount.last_ip = oldaccount.last_ip;
        newaccount.failed_logins = oldaccount.failed_logins;
        newaccount.locked = oldaccount.locked;
        newaccount.lock_country = oldaccount.lock_country;
        newaccount.last_login = oldaccount.last_login;
        newaccount.online = oldaccount.online;
        newaccount.expansion = oldaccount.expansion;
        newaccount.mutetime = oldaccount.mutetime;
        newaccount.mutereason = oldaccount.mutereason;
        newaccount.muteby = oldaccount.muteby;
        newaccount.locale = oldaccount.locale;
        newaccount.os = oldaccount.os;
        newaccount.recruiter = oldaccount.recruiter;
        return newaccount;
    }
    account() {
        platform = "''";
        hasBoost = 0;
    }

    int id;
    String username;
    String sha_pass_hash;
    String sessionkey;
    String v;
    String s;
    String reg_mail;
    String token_key;
    String email;
    String joindate;
    String last_ip;
    int failed_logins;
    int locked;
    String lock_country;
    String last_login;
    int online;
    int expansion;
    int mutetime;
    String mutereason;
    String muteby;
    int locale;
    String os;
    String platform;
    int recruiter;
    int hasBoost;

    public String to_sql() {
        String sql = "INSERT INTO `account` VALUES (";
        sql += String.valueOf(id);
        sql += ", ";
        sql += username;
        sql += ", ";
        sql += sha_pass_hash;
        sql += ", ";
        sql += sessionkey;
        sql += ", ";
        sql += v;
        sql += ", ";
        sql += s;
        sql += ", ";
        sql += reg_mail;
        sql += ", ";
        sql += token_key;
        sql += ", ";
        sql += email;
        sql += ", ";
        sql += joindate;
        sql += ", ";
        sql += last_ip;
        sql += ", ";
        sql += String.valueOf(failed_logins);
        sql += ", ";
        sql += String.valueOf(locked);
        sql += ", ";
        sql += lock_country;
        sql += ", ";
        sql += last_login;
        sql += ", ";
        sql += String.valueOf(online);
        sql += ", ";
        sql += String.valueOf(expansion);
        sql += ", ";
        sql += String.valueOf(mutetime);
        sql += ", ";
        sql += mutereason;
        sql += ", ";
        sql += muteby;
        sql += ", ";
        sql += String.valueOf(locale);
        sql += ", ";
        sql += os;
        sql += ", ";
        sql += platform;
        sql += ", ";
        sql += String.valueOf(recruiter);
        sql += ", ";
        sql += String.valueOf(hasBoost);
        sql += ");";
        return sql;
    }
}
