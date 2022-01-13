package com.marticus.customer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestData {
	private String activity;
	private String type;
	private int participants;
	private float price;
	private String link;
	private String key;
	private float accessibility;
}
