package com.mjc813.master_refer_interface;

import com.mjc813.master_refer_id.MasterTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReferDto implements IRefer {
    private Long id;
    private String name;
    private Long masterTableId;
    private MasterTable master;

    public Long getMasterTableId() {
        if ( this.master == null ) {
            this.master = new MasterTable();
        }
        return this.master.getId();
    }

    public void setMasterTableId(Long masterTableId) {
        if ( this.master == null ) {
            this.master = new MasterTable();
        }
        this.master.setId(masterTableId);
        this.masterTableId = masterTableId;
    }
}
