package com.mjc813.master_refer_interface;

import com.mjc813.master_refer_id.MasterTable;

public interface IRefer {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    Long getMasterTableId();
    void setMasterTableId(Long masterTableId);

    MasterTable getMaster();
    void setMaster(MasterTable masterTableId);

    default void copyMembers(IRefer src) {
        this.setId(src.getId());
        this.setName(src.getName());
        this.setMasterTableId(src.getMasterTableId());
        this.setMaster(src.getMaster());
    }
}
