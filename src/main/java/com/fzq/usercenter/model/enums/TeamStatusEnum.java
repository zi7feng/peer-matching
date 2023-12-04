package com.fzq.usercenter.model.enums;

/**
 * Team status enum
 */
public enum TeamStatusEnum {
    PUBLIC(0,"public"),
    PRIVATE(1,"Private"),
    ENCRYPTED(2,"Encrypted");

    private int value;
    private String text;

    public static TeamStatusEnum getEnumByValue(Integer value) {
        if (value == null){
            return null;
        }
        TeamStatusEnum[] values = TeamStatusEnum.values();
        for (TeamStatusEnum teamStatusEnum: values) {
            if (teamStatusEnum.getValue()==value) {
                return teamStatusEnum;
            }
        }
        return null;
    }

    TeamStatusEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}