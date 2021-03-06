package cn.bjhdltcdn.p2plive.model;

import android.os.Parcel;
import android.os.Parcelable;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "CALL_HISTORY".
 */
public class CallHistory
//        implements Parcelable
{
//
//    private String roomNumber = "";
//    private Long parentId = 0L;
//    /** Not-null value. */
//    private String recruitTitle = "";
//    private Integer type = 0;
//    private Long addTime = 0L;
//    private Long callDuration = 0L;
//    private String leaveMessage = "";
//    private Integer callStatus = 0;
//    private Integer isNewStatus = 0;
//    private String recruitJson = "";
//    private Long callUserId = 0L;
//
//    /** Used to resolve relations */
//    private transient DaoSession daoSession;
//
//    /** Used for active entity operations. */
//    private transient CallHistoryDao myDao;
//
//    private BaseUser baseUser;
//    private Long baseUser__resolvedKey;
//
//
//    public CallHistory() {
//    }
//
//    public CallHistory(String roomNumber) {
//        this.roomNumber = roomNumber;
//    }
//
//    public CallHistory(String roomNumber, Long parentId, String recruitTitle, Integer type, Long addTime, Long callDuration, String leaveMessage, Integer callStatus, Integer isNewStatus, String recruitJson, Long callUserId) {
//        this.roomNumber = roomNumber;
//        this.parentId = parentId;
//        this.recruitTitle = recruitTitle;
//        this.type = type;
//        this.addTime = addTime;
//        this.callDuration = callDuration;
//        this.leaveMessage = leaveMessage;
//        this.callStatus = callStatus;
//        this.isNewStatus = isNewStatus;
//        this.recruitJson = recruitJson;
//        this.callUserId = callUserId;
//    }
//
//    /** called by internal mechanisms, do not call yourself. */
//    public void __setDaoSession(DaoSession daoSession) {
//        this.daoSession = daoSession;
//        myDao = daoSession != null ? daoSession.getCallHistoryDao() : null;
//    }
//
//    public String getRoomNumber() {
//        return roomNumber;
//    }
//
//    public void setRoomNumber(String roomNumber) {
//        this.roomNumber = roomNumber;
//    }
//
//    public Long getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(Long parentId) {
//        this.parentId = parentId;
//    }
//
//    /** Not-null value. */
//    public String getRecruitTitle() {
//        return recruitTitle;
//    }
//
//    /** Not-null value; ensure this value is available before it is saved to the database. */
//    public void setRecruitTitle(String recruitTitle) {
//        this.recruitTitle = recruitTitle;
//    }
//
//    public Integer getType() {
//        return type;
//    }
//
//    public void setType(Integer type) {
//        this.type = type;
//    }
//
//    public Long getAddTime() {
//        return addTime;
//    }
//
//    public void setAddTime(Long addTime) {
//        this.addTime = addTime;
//    }
//
//    public Long getCallDuration() {
//        return callDuration;
//    }
//
//    public void setCallDuration(Long callDuration) {
//        this.callDuration = callDuration;
//    }
//
//    public String getLeaveMessage() {
//        return leaveMessage;
//    }
//
//    public void setLeaveMessage(String leaveMessage) {
//        this.leaveMessage = leaveMessage;
//    }
//
//    public Integer getCallStatus() {
//        return callStatus;
//    }
//
//    public void setCallStatus(Integer callStatus) {
//        this.callStatus = callStatus;
//    }
//
//    public Integer getIsNewStatus() {
//        return isNewStatus;
//    }
//
//    public void setIsNewStatus(Integer isNewStatus) {
//        this.isNewStatus = isNewStatus;
//    }
//
//    public String getRecruitJson() {
//        return recruitJson;
//    }
//
//    public void setRecruitJson(String recruitJson) {
//        this.recruitJson = recruitJson;
//    }
//
//    public Long getCallUserId() {
//        return callUserId;
//    }
//
//    public void setCallUserId(Long callUserId) {
//        this.callUserId = callUserId;
//    }
//
//    /** To-one relationship, resolved on first access. */
//    public BaseUser getBaseUser() {
//        Long __key = this.callUserId;
//        if (baseUser__resolvedKey == null || !baseUser__resolvedKey.equals(__key)) {
//            if (daoSession == null) {
//                throw new DaoException("Entity is detached from DAO context");
//            }
//            BaseUserDao targetDao = daoSession.getBaseUserDao();
//            BaseUser baseUserNew = targetDao.load(__key);
//            synchronized (this) {
//                baseUser = baseUserNew;
//            	baseUser__resolvedKey = __key;
//            }
//        }
//        return baseUser;
//    }
//
//    public void setBaseUser(BaseUser baseUser) {
//        synchronized (this) {
//            this.baseUser = baseUser;
//            callUserId = baseUser == null ? null : baseUser.getUserId();
//            baseUser__resolvedKey = callUserId;
//        }
//    }
//
//    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
//    public void delete() {
//        if (myDao == null) {
//            throw new DaoException("Entity is detached from DAO context");
//        }
//        myDao.delete(this);
//    }
//
//    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
//    public void update() {
//        if (myDao == null) {
//            throw new DaoException("Entity is detached from DAO context");
//        }
//        myDao.update(this);
//    }
//
//    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
//    public void refresh() {
//        if (myDao == null) {
//            throw new DaoException("Entity is detached from DAO context");
//        }
//        myDao.refresh(this);
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.roomNumber);
//        dest.writeValue(this.parentId);
//        dest.writeString(this.recruitTitle);
//        dest.writeValue(this.type);
//        dest.writeValue(this.addTime);
//        dest.writeValue(this.callDuration);
//        dest.writeString(this.leaveMessage);
//        dest.writeValue(this.callStatus);
//        dest.writeValue(this.isNewStatus);
//        dest.writeString(this.recruitJson);
//        dest.writeValue(this.callUserId);
//        dest.writeParcelable(this.baseUser, 0);
//    }
//
//    protected CallHistory(Parcel in) {
//        this.roomNumber = in.readString();
//        this.parentId = (Long) in.readValue(Long.class.getClassLoader());
//        this.recruitTitle = in.readString();
//        this.type = (Integer) in.readValue(Integer.class.getClassLoader());
//        this.addTime = (Long) in.readValue(Long.class.getClassLoader());
//        this.callDuration = (Long) in.readValue(Long.class.getClassLoader());
//        this.leaveMessage = in.readString();
//        this.callStatus = (Integer) in.readValue(Integer.class.getClassLoader());
//        this.isNewStatus = (Integer) in.readValue(Integer.class.getClassLoader());
//        this.recruitJson = in.readString();
//        this.callUserId = (Long) in.readValue(Long.class.getClassLoader());
//        this.baseUser = in.readParcelable(BaseUser.class.getClassLoader());
//    }
//
//    public static final Creator<CallHistory> CREATOR = new Creator<CallHistory>() {
//        public CallHistory createFromParcel(Parcel source) {
//            return new CallHistory(source);
//        }
//
//        public CallHistory[] newArray(int size) {
//            return new CallHistory[size];
//        }
//    };
}
