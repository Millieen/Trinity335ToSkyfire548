package TC335;

public class account {

    public account(String[] indata) {
        id = Integer.parseInt(indata[0]);
        username = indata[1];
        sha_pass_hash = indata[1];
        sessionkey = indata[1];
        v = indata[1];
        s = indata[1];
        totp_secret = indata[1];
        email = indata[1];
        reg_mail = indata[1];
        joindate = indata[1];
        last_ip = indata[1];
        last_attempt_ip = indata[1];
        failed_logins = Integer.parseInt(indata[0]);
        locked = Integer.parseInt(indata[0]);
        lock_country = indata[1];
        last_login = indata[1];
        online = Integer.parseInt(indata[0]);
        expansion = Integer.parseInt(indata[0]);
        mutetime = Integer.parseInt(indata[0]);
        mutereason = indata[1];
        muteby = indata[1];
        locale = Integer.parseInt(indata[0]);
        os = indata[1];
        recruiter = Integer.parseInt(indata[0]);
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
