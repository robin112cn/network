package com.whty.cms.network.pojo;

public class Device {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.device_id
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    private Integer deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.device_name
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    private String deviceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.device_type
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    private Integer deviceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.device_os
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    private String deviceOs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device.device_purpose
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    private String devicePurpose;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.device_id
     *
     * @return the value of device.device_id
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.device_id
     *
     * @param deviceId the value for device.device_id
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.device_name
     *
     * @return the value of device.device_name
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.device_name
     *
     * @param deviceName the value for device.device_name
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.device_type
     *
     * @return the value of device.device_type
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.device_type
     *
     * @param deviceType the value for device.device_type
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.device_os
     *
     * @return the value of device.device_os
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public String getDeviceOs() {
        return deviceOs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.device_os
     *
     * @param deviceOs the value for device.device_os
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs == null ? null : deviceOs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device.device_purpose
     *
     * @return the value of device.device_purpose
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public String getDevicePurpose() {
        return devicePurpose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device.device_purpose
     *
     * @param devicePurpose the value for device.device_purpose
     *
     * @mbggenerated Wed Jul 29 14:45:13 CST 2015
     */
    public void setDevicePurpose(String devicePurpose) {
        this.devicePurpose = devicePurpose == null ? null : devicePurpose.trim();
    }
}