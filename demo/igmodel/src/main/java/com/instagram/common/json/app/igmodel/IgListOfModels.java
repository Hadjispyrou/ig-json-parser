// Copyright 2004-present Facebook. All Rights Reserved.

package com.instagram.common.json.app.igmodel;

import java.util.List;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 * List of models for iterations > 1
 */
@JsonType
public class IgListOfModels {
  @JsonField(fieldName = "list")
  List<IgModelRequest> list;
}
