package com.mjc813.master_refer_id;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestMasterRefer {
    @Test
    public void referMasterIdTest() {
        MasterTable mt = new MasterTable(10L, "master");
        ReferTable rt = new ReferTable(20L, "refer", mt.getId(), mt);

        rt.getMaster().setId(33L);
        assertThat(rt.getMaster().getId()).isEqualTo(33L);
        assertThat(rt.getMasterTableId()).isEqualTo(33L);

        rt.setMasterTableId(44L);
        assertThat(rt.getMasterTableId()).isEqualTo(44L);
        assertThat(rt.getMaster().getId()).isEqualTo(44L);
    }
}
