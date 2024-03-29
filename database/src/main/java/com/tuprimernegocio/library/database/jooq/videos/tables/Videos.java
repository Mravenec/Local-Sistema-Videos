/*
 * This file is generated by jOOQ.
 */
package com.tuprimernegocio.library.database.jooq.videos.tables;


import com.tuprimernegocio.library.database.jooq.users.tables.Users;
import com.tuprimernegocio.library.database.jooq.videos.Indexes;
import com.tuprimernegocio.library.database.jooq.videos.Keys;
import com.tuprimernegocio.library.database.jooq.videos.tables.records.VideosRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Videos extends TableImpl<VideosRecord> {

    private static final long serialVersionUID = -1411517613;

    /**
     * The reference instance of <code>videos.videos</code>
     */
    public static final Videos VIDEOS_ = new Videos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VideosRecord> getRecordType() {
        return VideosRecord.class;
    }

    /**
     * The column <code>videos.videos.id</code>.
     */
    public final TableField<VideosRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>videos.videos.title</code>.
     */
    public final TableField<VideosRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>videos.videos.url</code>.
     */
    public final TableField<VideosRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>videos.videos.content</code>.
     */
    public final TableField<VideosRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>videos.videos.sequence_number</code>.
     */
    public final TableField<VideosRecord, Integer> SEQUENCE_NUMBER = createField(DSL.name("sequence_number"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>videos.videos.is_active</code>.
     */
    public final TableField<VideosRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>videos.videos.section_id</code>.
     */
    public final TableField<VideosRecord, Integer> SECTION_ID = createField(DSL.name("section_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>videos.videos.added_by</code>.
     */
    public final TableField<VideosRecord, Integer> ADDED_BY = createField(DSL.name("added_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>videos.videos.created_at</code>.
     */
    public final TableField<VideosRecord, Timestamp> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>videos.videos</code> table reference
     */
    public Videos() {
        this(DSL.name("videos"), null);
    }

    /**
     * Create an aliased <code>videos.videos</code> table reference
     */
    public Videos(String alias) {
        this(DSL.name(alias), VIDEOS_);
    }

    /**
     * Create an aliased <code>videos.videos</code> table reference
     */
    public Videos(Name alias) {
        this(alias, VIDEOS_);
    }

    private Videos(Name alias, Table<VideosRecord> aliased) {
        this(alias, aliased, null);
    }

    private Videos(Name alias, Table<VideosRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Videos(Table<O> child, ForeignKey<O, VideosRecord> key) {
        super(child, key, VIDEOS_);
    }

    @Override
    public Schema getSchema() {
        return com.tuprimernegocio.library.database.jooq.videos.Videos.VIDEOS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VIDEOS_ADDED_BY, Indexes.VIDEOS_PRIMARY, Indexes.VIDEOS_SECTION_ID, Indexes.VIDEOS_URL);
    }

    @Override
    public Identity<VideosRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VIDEOS_;
    }

    @Override
    public UniqueKey<VideosRecord> getPrimaryKey() {
        return Keys.KEY_VIDEOS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VideosRecord>> getKeys() {
        return Arrays.<UniqueKey<VideosRecord>>asList(Keys.KEY_VIDEOS_PRIMARY, Keys.KEY_VIDEOS_URL);
    }

    @Override
    public List<ForeignKey<VideosRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VideosRecord, ?>>asList(Keys.VIDEOS_IBFK_1, Keys.VIDEOS_IBFK_2);
    }

    public Sections sections() {
        return new Sections(this, Keys.VIDEOS_IBFK_1);
    }

    public Users users() {
        return new Users(this, Keys.VIDEOS_IBFK_2);
    }

    @Override
    public Videos as(String alias) {
        return new Videos(DSL.name(alias), this);
    }

    @Override
    public Videos as(Name alias) {
        return new Videos(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Videos rename(String name) {
        return new Videos(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Videos rename(Name name) {
        return new Videos(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Integer, Byte, Integer, Integer, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
