package com.leepantam.s2.robot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ar")
public class Arm_Right extends Arm {
	public Arm_Right() {
		this.setName("Right Arm");
	}
}
