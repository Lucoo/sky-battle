/*
 * This file is generated by jOOQ.
*/
package com.lucoo.sky.battle.jooq.tables;


import com.lucoo.sky.battle.jooq.ConfigRepository;
import com.lucoo.sky.battle.jooq.Keys;
import com.lucoo.sky.battle.jooq.tables.records.ApplicationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Application extends TableImpl<ApplicationRecord> {

    private static final long serialVersionUID = -1773016842;

    /**
     * The reference instance of <code>config-repository.application</code>
     */
    public static final Application APPLICATION = new Application();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationRecord> getRecordType() {
        return ApplicationRecord.class;
    }

    /**
     * The column <code>config-repository.application.ID</code>. 编号
     */
    public final TableField<ApplicationRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "编号");

    /**
     * The column <code>config-repository.application.application</code>. 应用名称
     */
    public final TableField<ApplicationRecord, String> APPLICATION_ = createField("application", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "应用名称");

    /**
     * Create a <code>config-repository.application</code> table reference
     */
    public Application() {
        this("application", null);
    }

    /**
     * Create an aliased <code>config-repository.application</code> table reference
     */
    public Application(String alias) {
        this(alias, APPLICATION);
    }

    private Application(String alias, Table<ApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Application(String alias, Table<ApplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ConfigRepository.CONFIG_REPOSITORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ApplicationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationRecord> getPrimaryKey() {
        return Keys.KEY_APPLICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationRecord>>asList(Keys.KEY_APPLICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Application as(String alias) {
        return new Application(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Application rename(String name) {
        return new Application(name, null);
    }
}
