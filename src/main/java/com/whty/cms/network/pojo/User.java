package com.whty.cms.network.pojo;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_name
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_type
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private Integer userType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_department
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private String userDepartment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_phone
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private String userPhone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_leader
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private String userLeader;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.device_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	private Integer deviceId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_name
	 * @return  the value of user.user_name
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_name
	 * @param userName  the value for user.user_name
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_type
	 * @return  the value of user.user_type
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public Integer getUserType() {
		return userType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_type
	 * @param userType  the value for user.user_type
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_department
	 * @return  the value of user.user_department
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getUserDepartment() {
		return userDepartment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_department
	 * @param userDepartment  the value for user.user_department
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment == null ? null : userDepartment
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_phone
	 * @return  the value of user.user_phone
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_phone
	 * @param userPhone  the value for user.user_phone
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_leader
	 * @return  the value of user.user_leader
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public String getUserLeader() {
		return userLeader;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_leader
	 * @param userLeader  the value for user.user_leader
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setUserLeader(String userLeader) {
		this.userLeader = userLeader == null ? null : userLeader.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.device_id
	 * @return  the value of user.device_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public Integer getDeviceId() {
		return deviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.device_id
	 * @param deviceId  the value for user.device_id
	 * @mbggenerated  Fri Aug 21 16:44:04 CST 2015
	 */
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
}