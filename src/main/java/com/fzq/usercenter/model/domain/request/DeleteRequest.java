package com.fzq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteRequest implements Serializable {


    private static final long serialVersionUID = -6388778901856273403L;

    private long id;
}
