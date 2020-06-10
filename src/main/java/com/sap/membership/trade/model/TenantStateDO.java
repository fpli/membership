package com.sap.membership.trade.model;

/**
 * 客房状态信息
 */
public class TenantStateDO {

    private String roomId;

    private String roomState;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState == null ? null : roomState.trim();
    }
}