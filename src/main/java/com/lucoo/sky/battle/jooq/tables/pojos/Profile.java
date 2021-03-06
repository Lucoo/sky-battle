/*
 * This file is generated by jOOQ.
*/
package com.lucoo.sky.battle.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Profile implements Serializable {

    private static final long serialVersionUID = 152409886;

    private Integer id;
    private String  profile;
    private Integer applicationId;

    public Profile() {}

    public Profile(Profile value) {
        this.id = value.id;
        this.profile = value.profile;
        this.applicationId = value.applicationId;
    }

    public Profile(
        Integer id,
        String  profile,
        Integer applicationId
    ) {
        this.id = id;
        this.profile = profile;
        this.applicationId = applicationId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Integer getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Profile (");

        sb.append(id);
        sb.append(", ").append(profile);
        sb.append(", ").append(applicationId);

        sb.append(")");
        return sb.toString();
    }
}
