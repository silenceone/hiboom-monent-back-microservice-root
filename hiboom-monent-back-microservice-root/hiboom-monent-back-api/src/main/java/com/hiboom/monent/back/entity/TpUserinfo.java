package com.hiboom.monent.back.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TpUserinfo implements Serializable {
    /**
     * 主键id.
     */
    private Integer id;
    /**
     * token.
     */
    private String token;
    /**
     * 微信id.
     */
    private String wechaId;
    /**
     * 手机号码.
     */
    private String tel;
    /**
     * 密码.
     */
    private String password;
    /**
     * 真实姓名.
     */
    private String truename;
    /**
     * 现金金额.
     */
    private Double yue;
    /**
     * Hi币金额.
     */
    private Float balance;
    /**
     * .
     */
    private String bingo;
    /**
     * 消费总额.
     */
    private Float balanceBf;
    /**
     * 积分.
     */
    private Integer totalScore;
    /**
     * 微信头像.
     */
    private String txLogo;
    /**
     * 帮派id.
     */
    private Integer factionId;
    /**
     * 头像.
     */
    private String portrait;
    /**
     * .
     */
    private Integer expensetotal;
    /**
     * .
     */
    private Integer wallopen;
    /**
     * 消费积分总额.
     */
    private Integer totalScoreBf;
    /**
     * .
     */
    private String wechaname;
    /**
     * 出生年.
     */
    private String bornyear;
    /**
     * 出生月.
     */
    private String bornmonth;
    /**
     * 出生日.
     */
    private String bornday;
    /**
     * .
     */
    private String qq;
    /**
     * 性别.
     */
    private String sex;
    /**
     * 年龄.
     */
    private String age;
    /**
     * 1 新历 2 农历.
     */
    private Integer birthdayType;
    /**
     * 身份证号码.
     */
    private String idcard;
    /**
     * 生日.
     */
    private String birthday;
    /**
     * 地址.
     */
    private String address;
    /**
     * .
     */
    private String info;
    /**
     * 签到奖励.
     */
    private Integer signScore;
    /**
     * .
     */
    private Integer expendScore;
    /**
     * .
     */
    private Integer continuous;
    /**
     * .
     */
    private Integer addExpend;
    /**
     * .
     */
    private Integer addExpendTime;
    /**
     *.
     */
    private Integer liveTime;
    /**
     * .
     */
    private Integer getcardtime;
    /**
     * .
     */
    private String paypass;
    /**
     * 推广id.
     */
    private String twid;
    /**
     * 帐号.
     */
    private String username;
    /**
     * .
     */
    private String city;
    /**
     * .
     */
    private String province;
    /**
     * .
     */
    private Integer storeId;
    /**
     * 注册时间.
     */
    private String regtime;
    /**
     * .
     */
    private String fakeopenid;
    /**
     * .
     */
    private Boolean issub;
    /**
     * 会员等级.
     */
    private Boolean isvip;
    /**
     * .
     */
    private String company;
    /**
     * .
     */
    private String job;
    /**
     * .
     */
    private String loving;
    /**
     * 活动区域.
     */
    private String area;
    /**
     * 其他兴趣爱好.
     */
    private String otherinterest;
    /**
     * 自选兴趣爱好.
     */
    private String interest;
    /**
     * 最后刷卡时间.
     */
    private Integer finaltime;
    /**
     * 所属店铺.
     */
    private Integer firstCid;
    /**
     * 推广人微信.
     */
    private String shareWx;
    /**
     * 是否已获取新手大礼包 0未获取 1获取.
     */
    private Integer isNovice;
    /**
     * 会员卡状态 1 正常 2 冻结 3 禁用.
     */
    private Integer status;
    /**
     * 会员等级.
     */
    private Integer levelId;
    /**
     * 是否为公司组织 1 是.
     */
    private Integer isTeam;
    /**
     * 免费抽奖次数.
     */
    private Integer luckyDrawCount;
    /**
     * .
     */
    private String openid;
    /**
     * 小程序id.
     */
    private String openidx;

    private String drpCart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWechaId() {
        return wechaId;
    }

    public void setWechaId(String wechaId) {
        this.wechaId = wechaId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Double getYue() {
        return yue;
    }

    public void setYue(Double yue) {
        this.yue = yue;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getBingo() {
        return bingo;
    }

    public void setBingo(String bingo) {
        this.bingo = bingo;
    }

    public Float getBalanceBf() {
        return balanceBf;
    }

    public void setBalanceBf(Float balanceBf) {
        this.balanceBf = balanceBf;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getTxLogo() {
        return txLogo;
    }

    public void setTxLogo(String txLogo) {
        this.txLogo = txLogo;
    }

    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Integer getExpensetotal() {
        return expensetotal;
    }

    public void setExpensetotal(Integer expensetotal) {
        this.expensetotal = expensetotal;
    }

    public Integer getWallopen() {
        return wallopen;
    }

    public void setWallopen(Integer wallopen) {
        this.wallopen = wallopen;
    }

    public Integer getTotalScoreBf() {
        return totalScoreBf;
    }

    public void setTotalScoreBf(Integer totalScoreBf) {
        this.totalScoreBf = totalScoreBf;
    }

    public String getWechaname() {
        return wechaname;
    }

    public void setWechaname(String wechaname) {
        this.wechaname = wechaname;
    }

    public String getBornyear() {
        return bornyear;
    }

    public void setBornyear(String bornyear) {
        this.bornyear = bornyear;
    }

    public String getBornmonth() {
        return bornmonth;
    }

    public void setBornmonth(String bornmonth) {
        this.bornmonth = bornmonth;
    }

    public String getBornday() {
        return bornday;
    }

    public void setBornday(String bornday) {
        this.bornday = bornday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBirthdayType() {
        return birthdayType;
    }

    public void setBirthdayType(Integer birthdayType) {
        this.birthdayType = birthdayType;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getSignScore() {
        return signScore;
    }

    public void setSignScore(Integer signScore) {
        this.signScore = signScore;
    }

    public Integer getExpendScore() {
        return expendScore;
    }

    public void setExpendScore(Integer expendScore) {
        this.expendScore = expendScore;
    }

    public Integer getContinuous() {
        return continuous;
    }

    public void setContinuous(Integer continuous) {
        this.continuous = continuous;
    }

    public Integer getAddExpend() {
        return addExpend;
    }

    public void setAddExpend(Integer addExpend) {
        this.addExpend = addExpend;
    }

    public Integer getAddExpendTime() {
        return addExpendTime;
    }

    public void setAddExpendTime(Integer addExpendTime) {
        this.addExpendTime = addExpendTime;
    }

    public Integer getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    public Integer getGetcardtime() {
        return getcardtime;
    }

    public void setGetcardtime(Integer getcardtime) {
        this.getcardtime = getcardtime;
    }

    public String getPaypass() {
        return paypass;
    }

    public void setPaypass(String paypass) {
        this.paypass = paypass;
    }

    public String getTwid() {
        return twid;
    }

    public void setTwid(String twid) {
        this.twid = twid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public String getFakeopenid() {
        return fakeopenid;
    }

    public void setFakeopenid(String fakeopenid) {
        this.fakeopenid = fakeopenid;
    }

    public Boolean getIssub() {
        return issub;
    }

    public void setIssub(Boolean issub) {
        this.issub = issub;
    }

    public Boolean getIsvip() {
        return isvip;
    }

    public void setIsvip(Boolean isvip) {
        this.isvip = isvip;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLoving() {
        return loving;
    }

    public void setLoving(String loving) {
        this.loving = loving;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOtherinterest() {
        return otherinterest;
    }

    public void setOtherinterest(String otherinterest) {
        this.otherinterest = otherinterest;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Integer getFinaltime() {
        return finaltime;
    }

    public void setFinaltime(Integer finaltime) {
        this.finaltime = finaltime;
    }

    public Integer getFirstCid() {
        return firstCid;
    }

    public void setFirstCid(Integer firstCid) {
        this.firstCid = firstCid;
    }

    public String getShareWx() {
        return shareWx;
    }

    public void setShareWx(String shareWx) {
        this.shareWx = shareWx;
    }

    public Integer getIsNovice() {
        return isNovice;
    }

    public void setIsNovice(Integer isNovice) {
        this.isNovice = isNovice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getIsTeam() {
        return isTeam;
    }

    public void setIsTeam(Integer isTeam) {
        this.isTeam = isTeam;
    }

    public Integer getLuckyDrawCount() {
        return luckyDrawCount;
    }

    public void setLuckyDrawCount(Integer luckyDrawCount) {
        this.luckyDrawCount = luckyDrawCount;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getOpenidx() {
        return openidx;
    }

    public void setOpenidx(String openidx) {
        this.openidx = openidx;
    }

    public String getDrpCart() {
        return drpCart;
    }

    public void setDrpCart(String drpCart) {
        this.drpCart = drpCart;
    }
}