package TC335;

public class account {

    public account(String[] indata) {
        id = Integer.parseInt(indata[0]);
        username = indata[1];
        sha_pass_hash = indata[2];
        sessionkey = indata[3];
        v = indata[4];
        s = indata[5];
        totp_secret = indata[6];
        email = indata[7];
        reg_mail = indata[8];
        joindate = indata[9];
        last_ip = indata[10];
        last_attempt_ip = indata[11];
        failed_logins = Integer.parseInt(indata[12]);
        locked = Integer.parseInt(indata[13]);
        lock_country = indata[14];
        last_login = indata[15];
        online = Integer.parseInt(indata[16]);
        expansion = Integer.parseInt(indata[17]);
        mutetime = Integer.parseInt(indata[18]);
        mutereason = indata[19];
        muteby = indata[20];
        locale = Integer.parseInt(indata[21]);
        os = indata[22];
        recruiter = Integer.parseInt(indata[23]);
    };

    public int id;
    public String username;
    public String sha_pass_hash;
    public String sessionkey;
    public String v;
    public String s;
    public String totp_secret;
    public String email;
    public String reg_mail;
    public String joindate;
    public String last_ip;
    public String last_attempt_ip;
    public int failed_logins;
    public int locked;
    public String lock_country;
    public String last_login;
    public int online;
    public int expansion;
    public int mutetime;
    public String mutereason;
    public String muteby;
    public int locale;
    public String os;
    public int recruiter;

}
