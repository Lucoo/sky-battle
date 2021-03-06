/*
 * This file is generated by jOOQ.
*/
package com.lucoo.sky.battle.jooq.tables.records;


import com.lucoo.sky.battle.jooq.tables.Application;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ApplicationRecord extends UpdatableRecordImpl<ApplicationRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 2058426496;

    /**
     * Setter for <code>config-repository.application.ID</code>. 编号
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>config-repository.application.ID</code>. 编号
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>config-repository.application.application</code>. 应用名称
     */
    public void setApplication(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>config-repository.application.application</code>. 应用名称
     */
    public String getApplication() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Application.APPLICATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Application.APPLICATION.APPLICATION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getApplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value2(String value) {
        setApplication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationRecord
     */
    public ApplicationRecord() {
        super(Application.APPLICATION);
    }

    /**
     * Create a detached, initialised ApplicationRecord
     */
    public ApplicationRecord(Integer id, String application) {
        super(Application.APPLICATION);

        set(0, id);
        set(1, application);
    }
}
