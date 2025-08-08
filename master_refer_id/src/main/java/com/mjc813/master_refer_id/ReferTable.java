package com.mjc813.master_refer_id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReferTable {
    private Long id;
    private String name;
    private Long masterTableId;
    private MasterTable master;

    public ReferTable(Long id, String name, Long masterTableId, MasterTable master) {
        this.id = id;
        this.name = name;
        this.masterTableId = masterTableId;
        //this.master = master;
        this.master = new MasterTable(master.getId(), master.getName());
    }

    public Long getMasterTableId() {
        return master.getId();
    }
    public void setMasterTableId(Long masterTableId) {
        master.setId(masterTableId);
    }
}
