package com.tory.guide.exec;

import com.tory.guide.service.GuideService;
import com.tory.guide.service.impl.GuideServiceImplV1;

public class ExecA {
	public static void main(String[] args) {
		GuideService guideService = new GuideServiceImplV1();
		guideService.loadGuide();
		guideService.printGuideList();
	}

}
