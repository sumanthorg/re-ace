package com.mapper;

import java.util.List;

import com.input.ConfigitAceImport.Library.ConfiguratorLayouts;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs.LayoutTab;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs.LayoutTab.LayoutSections.LayoutSection;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs.LayoutTab.LayoutSections.LayoutSection.LayoutFeatureFamilies;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs.LayoutTab.LayoutSections.LayoutSection.LayoutFeatureFamilies.LayoutFeatureFamily;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts.ConfiguratorLayout.LayoutTabs.LayoutTab.LayoutSections.LayoutSection.LayoutFeatureFamilies.LayoutFeatureFamily.LayoutFeatures.LayoutFeature;
import com.output.ConfiguratorLayoutCollection;
import com.output.ConfiguratorLayoutType;
import com.output.LayoutFeatureCollection;
import com.output.LayoutFeatureFamilyCollection;
import com.output.LayoutFeatureFamilyType;
import com.output.LayoutFeatureType;
import com.output.LayoutSectionCollection;
import com.output.LayoutSectionType;
import com.output.LayoutTabCollection;
import com.output.LayoutTabType;

public class ConfiguratorLayoutsMapper {

	public static void map(ConfiguratorLayouts inConfiguratorLayouts, ConfiguratorLayoutCollection outConfiguratorLayouts) {
		ConfiguratorLayoutType configuratorLayoutType = new ConfiguratorLayoutType();
		configuratorLayoutType.setLayoutTabs(new LayoutTabCollection());
		
		configuratorLayoutType.setCode(inConfiguratorLayouts.getConfiguratorLayout().getCode());
		configuratorLayoutType.setDescription(inConfiguratorLayouts.getConfiguratorLayout().getDescription());
		configuratorLayoutType.setName(inConfiguratorLayouts.getConfiguratorLayout().getName());
		//configuratorLayoutType.setLayoutTabs(value); // setting in the next line
		mapLayoutTabs(inConfiguratorLayouts.getConfiguratorLayout().getLayoutTabs(), configuratorLayoutType.getLayoutTabs());
		
		outConfiguratorLayouts.getConfiguratorLayout().add(configuratorLayoutType);
	}

	private static void mapLayoutTabs(LayoutTabs inLayoutTabs, LayoutTabCollection outLayoutTabs) {
		LayoutTabType layoutTabType = new LayoutTabType();
		layoutTabType.setName(inLayoutTabs.getLayoutTab().getName());
		layoutTabType.setPosition(inLayoutTabs.getLayoutTab().getPosition());
		
		outLayoutTabs.getLayoutTab().add(layoutTabType);

		mapLayoutSections(inLayoutTabs.getLayoutTab(),outLayoutTabs.getLayoutTab());
		
	}

	private static void mapLayoutSections(LayoutTab inLayoutTab, List<LayoutTabType> outLayoutTab) {
		LayoutSectionCollection layoutSectionCollection = new LayoutSectionCollection();
		LayoutSectionType layoutSectionType;
		List<LayoutSection> layoutSectionList = inLayoutTab.getLayoutSections().getLayoutSection();
		for (LayoutSection layoutSection : layoutSectionList) {
			layoutSectionType = new LayoutSectionType();
			layoutSectionType.setName(layoutSection.getName());
			layoutSectionType.setPosition(layoutSection.getPosition());
			mapLayoutFeatureFamilies(layoutSection,layoutSectionType);
			
			layoutSectionCollection.getLayoutSection().add(layoutSectionType);
		}
		outLayoutTab.get(0).setLayoutSections(layoutSectionCollection);
	}

	private static void mapLayoutFeatureFamilies(LayoutSection layoutSection, LayoutSectionType layoutSectionType) {
		LayoutFeatureFamilyCollection layoutFFCollection = new LayoutFeatureFamilyCollection(); layoutSectionType.setLayoutFeatureFamilies(layoutFFCollection);
		LayoutFeatureFamilyType layoutFFtype;
		List<LayoutFeatureFamily> layoutFFList = layoutSection.getLayoutFeatureFamilies().getLayoutFeatureFamily();
		for (LayoutFeatureFamily layoutFeatureFamily : layoutFFList) {
			layoutFFtype = new LayoutFeatureFamilyType();
			layoutFFtype.setFeatureFamily(layoutFeatureFamily.getFeatureFamily());
			layoutFFtype.setCustomSort(Boolean.parseBoolean(layoutFeatureFamily.getCustomSort()));
			layoutFFtype.setPosition(layoutFeatureFamily.getPosition());
			mapLayoutFeature(layoutFeatureFamily,layoutFFtype);
			layoutFFCollection.getLayoutFeatureFamily().add(layoutFFtype);
		}
	}

	private static void mapLayoutFeature(LayoutFeatureFamily layoutFeatureFamily, LayoutFeatureFamilyType layoutFFtype) {
		LayoutFeatureCollection layoutFeatureCollection = new LayoutFeatureCollection(); layoutFFtype.setLayoutFeatures(layoutFeatureCollection);
		LayoutFeatureType layoutFeatureType;
		List<LayoutFeature> layoutFeatureList = layoutFeatureFamily.getLayoutFeatures().getLayoutFeature();
		for (LayoutFeature layoutFeature : layoutFeatureList) {
			layoutFeatureType = new LayoutFeatureType();
			layoutFeatureType.setFeature(layoutFeature.getFeature());
			layoutFeatureType.setPosition(layoutFeature.getPosition());
			
			layoutFeatureCollection.getLayoutFeature().add(layoutFeatureType);
		}
		
	}


}
