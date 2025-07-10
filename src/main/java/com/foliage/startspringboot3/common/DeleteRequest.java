package com.foliage.startspringboot3.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteRequest implements Serializable {
    private static final long serialVersionUID = 2542969912832534671L;

    /**
     * id
     */
    private Long id;

}
