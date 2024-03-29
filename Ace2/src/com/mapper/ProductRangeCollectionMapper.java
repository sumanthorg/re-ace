package com.mapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.helper.HashMapKey;
import com.helper.HashMapValue;
import com.input.ConfigitAceImport.ProductRanges;
import com.input.ConfigitAceImport.ProductRanges.ProductRange;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.BrochureModels.BrochureModel;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.Events.Event;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.Markets.Market;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.IncludedFamilies.Family;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureAssociations.Feature;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.MarketAvailability.MarketAvailabilitySpan;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.MarketAvailability.MarketAvailabilitySpan.BrochureModelDerivatives.BrochureModelDerivative;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.Rules.TextRules.TextRule;
import com.output.AvailabilityEnum;
import com.output.BasicsType;
import com.output.BrochureModelCollection;
import com.output.BrochureModelDerivativeCollection;
import com.output.BrochureModelDerivativeType;
import com.output.BrochureModelType;
import com.output.DefaultConfiguratorLayoutType;
import com.output.EffectivityCollection;
import com.output.EffectivityType;
import com.output.EventCollection;
import com.output.EventType;
import com.output.EventTypeEnum;
import com.output.FamilyCodeCollection;
import com.output.FamilyCodeType;
import com.output.FeatureApplicabilityInfoCollection;
import com.output.FeatureApplicabilityInfoType;
import com.output.FeatureApplicabilitySpanCollection;
import com.output.FeatureApplicabilitySpanType;
import com.output.FeatureApplicabilityType;
import com.output.FeatureCodeCollection;
import com.output.FeatureCodeType;
import com.output.IncludedFamilyCollection;
import com.output.IncludedFamilyType;
import com.output.MarketAvailabilitySpanCollection;
import com.output.MarketAvailabilitySpanType;
import com.output.MarketCodeCollection;
import com.output.MarketCodeType;
import com.output.MarketingValueEnum;
import com.output.ProductRangeCollection;
import com.output.ProductRangeFeatureAssociationCollection;
import com.output.ProductRangeFeatureAssociationType;
import com.output.ProductRangeType;
import com.output.RuleIntentEnum;
import com.output.RuleType;
import com.output.SecurityLevelEnum;
import com.output.TextRuleCollection;
import com.output.TextRuleType;

public class ProductRangeCollectionMapper {

	public static void map(ProductRanges inProductRanges, ProductRangeCollection outProductRanges) {
		// TODO Auto-generated method stub
		List<ProductRangeType> outProductRangeList = outProductRanges.getProductRange();
		ProductRangeType outProductRange;
		for (ProductRange inProductRange : inProductRanges.getProductRange()) {
			outProductRange = new ProductRangeType();
			
			mapBasics(inProductRange,outProductRange);
			mapProgrammes(inProductRange,outProductRange);
			mapEvents(inProductRange,outProductRange);
			mapFeatureAssociations(inProductRange,outProductRange);
			mapModelYearMappings(inProductRange,outProductRange);
			mapBrochureModels(inProductRange,outProductRange);
			mapMarketAvailability(inProductRange,outProductRange);
			mapFeatureApplicability(inProductRange,outProductRange);
			mapRules(inProductRange,outProductRange);
			mapSellableUnits(inProductRange,outProductRange);
			mapDefaultConfiguratorLayout(inProductRange,outProductRange);
			mapProductRangeProperties(inProductRange,outProductRange);
			mapDeleteModelYearMappings(inProductRange,outProductRange);
			mapDeleteRules(inProductRange,outProductRange);
			mapCode(inProductRange,outProductRange);
			
			System.out.println(" in PR");
			outProductRangeList.add(outProductRange);
		}
	}

	private static void mapCode(ProductRange inProductRange, ProductRangeType outProductRange) {
		outProductRange.setCode(inProductRange.getCode());
	}

	private static void mapDeleteRules(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No delete rules as of now
		
	}

	private static void mapDeleteModelYearMappings(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No delete model year mappings as of now
		
	}

	private static void mapProductRangeProperties(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No Product Range Properties as of now
		
	}

	private static void mapDefaultConfiguratorLayout(ProductRange inProductRange, ProductRangeType outProductRange) {
		DefaultConfiguratorLayoutType defConfLayoutType = new DefaultConfiguratorLayoutType();
		defConfLayoutType.setConfiguratorLayout(inProductRange.getDefaultConfiguratorLayout().getConfiguratorLayout().toString());
		outProductRange.setDefaultConfiguratorLayout(defConfLayoutType);
	}

	private static void mapSellableUnits(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No ---- as of now
		
	}

	private static void mapRules(ProductRange inProductRange, ProductRangeType outProductRange) {
		// TODO Auto-generated method stub
		TextRuleType textRuleType;
		RuleType ruleType = new RuleType();
		ruleType.setTextRules(new TextRuleCollection());
		outProductRange.setRules(ruleType);
		for (TextRule textRule : inProductRange.getRules().getTextRules().getTextRule()) {
			textRuleType = new TextRuleType();
			textRuleType.setBody(textRule.getBody());
			textRuleType.setCode(textRule.getCode());
			textRuleType.setDescription(textRule.getDescription());
			textRuleType.setStartEvent(textRule.getStartEvent());
			textRuleType.setEndEvent(textRule.getEndEvent());
			textRuleType.setIntent(RuleIntentEnum.ENGINEERING.toString().equalsIgnoreCase(textRule.getIntent())?RuleIntentEnum.ENGINEERING:RuleIntentEnum.MARKETING);
			// 3 more textRuleType.setters
			outProductRange.getRules().getTextRules().getTextRule().add(textRuleType);
		}
		
	}

	private static void mapFeatureApplicability(ProductRange inProductRange, ProductRangeType outProductRange) {
		FeatureApplicabilityType featureApplicabilityType = new FeatureApplicabilityType();
		outProductRange.setFeatureApplicability(featureApplicabilityType);

		mapIncludedFamilies(inProductRange.getFeatureApplicability(),outProductRange.getFeatureApplicability());
		mapFeatureApplicabilitySpans(inProductRange.getFeatureApplicability(),outProductRange.getFeatureApplicability());
		
		/* This maps as it is
		 * 
		 * outProductRange.getFeatureApplicability().getIncludedFamiliesAndFeatureApplicabilitySpans().addAll(inProductRange.getFeatureApplicability().getIncludedFamilies().getFamily());
		outProductRange.getFeatureApplicability().getIncludedFamiliesAndFeatureApplicabilitySpans().addAll(inProductRange.getFeatureApplicability().getFeatureApplicabilitySpans().getFeatureApplicabilitySpan());
		*/
	}
	
	private static void mapFeatureApplicabilitySpans(FeatureApplicability inFeatureApplicability,	FeatureApplicabilityType outFeatureApplicability) {
		
		System.out.println("inside mapFeatureApplicabilitySpans");
		Map<HashMapKey, HashMapValue> hm = new HashMap<>(); getCorrectedDataInMap(inFeatureApplicability.getFeatureApplicabilitySpans(),hm);
		
		FeatureApplicabilitySpanCollection featureApplicabilitySpanCollection = new FeatureApplicabilitySpanCollection();
		List<FeatureApplicabilitySpanType> spanList = featureApplicabilitySpanCollection.getFeatureApplicabilitySpan();
		Iterator it = hm.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        FeatureApplicabilitySpanType span = new FeatureApplicabilitySpanType();
	        
	        HashMapKey key = (HashMapKey) pair.getKey();
	        HashMapValue value = (HashMapValue) pair.getValue();
	        
	        span.setFamily(key.getFamily());
	        span.setStartEvent(key.getStartEvent());
	        span.setEndEvent(key.getEndEvent());
	        
	        span.setMarkets(new MarketCodeCollection());
	        span.setBrochureModelDerivatives(new BrochureModelDerivativeCollection());
	        span.setFeatures(new FeatureApplicabilityInfoCollection());
	        
	        MarketCodeType marketOutput;
	        Set<MarketCodeType> marketOutputSet = new HashSet<>();
	        Set<Market> marketSet =  value.getMarkets();
	        for (Market market : marketSet) {
	        	marketOutput = new MarketCodeType();
				marketOutput.setCode(market.getCode());
				marketOutputSet.add(marketOutput);
			}
	        span.getMarkets().getMarket().addAll(marketOutputSet);
	        
	        BrochureModelDerivativeType bmdOutput;
	        Set<BrochureModelDerivativeType> bmdOutputSet = new HashSet<>();
	        Set<com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.BrochureModelDerivatives.BrochureModelDerivative> bmdSet = value.getBrochureModelDerivatives();
	        for (com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.BrochureModelDerivatives.BrochureModelDerivative brochureModelDerivative : bmdSet) {
				bmdOutput = new BrochureModelDerivativeType();
				bmdOutput.setBrochureModel(brochureModelDerivative.getBrochureModel());
				bmdOutput.setDerivative(brochureModelDerivative.getDerivative());
				bmdOutputSet.add(bmdOutput);
			}
	        span.getBrochureModelDerivatives().getBrochureModelDerivative().addAll(bmdOutputSet);
	       
	        
	        FeatureApplicabilityInfoType featureOutput;
	        Set<FeatureApplicabilityInfoType> featureOutputSet = new HashSet<>();
	        Set<com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.Features.Feature> featureList = value.getFeatures();
	        for (com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.Features.Feature feature : featureList) {
				featureOutput = new FeatureApplicabilityInfoType();
				featureOutput.setMarketingValue(MarketingValueEnum.valueOf(feature.getMarketingValue().trim().toUpperCase()));
				featureOutput.setCode(feature.getCode());
				featureOutput.setAvailability(AvailabilityEnum.valueOf(feature.getAvailability().trim().toUpperCase()));
				featureOutputSet.add(featureOutput);
			}
	        span.getFeatures().getFeature().addAll(featureOutputSet);
	  
	        spanList.add(span);
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		outFeatureApplicability.getIncludedFamiliesAndFeatureApplicabilitySpans().add(featureApplicabilitySpanCollection);
	}

	private static void getCorrectedDataInMap(FeatureApplicabilitySpans featureApplicabilitySpans, Map<HashMapKey, HashMapValue> hm) {
		
		List<FeatureApplicabilitySpan> FASpanList = featureApplicabilitySpans.getFeatureApplicabilitySpan();
		
		for (FeatureApplicabilitySpan featureApplicabilitySpan : FASpanList) {
			HashMapKey localKey = new HashMapKey();
			localKey.setFamily(featureApplicabilitySpan.getFamily());
			localKey.setStartEvent(featureApplicabilitySpan.getStartEvent());
			localKey.setEndEvent(featureApplicabilitySpan.getEndEvent());
			
			if(hm.containsKey(localKey)){
				HashMapValue hmValue = hm.get(localKey);
				hmValue.getMarkets().addAll(featureApplicabilitySpan.getMarkets().getMarket());
				hmValue.getBrochureModelDerivatives().addAll(featureApplicabilitySpan.getBrochureModelDerivatives().getBrochureModelDerivative());
				hmValue.getFeatures().add(featureApplicabilitySpan.getFeatures().getFeature());
			}else{
				HashMapValue hmValue = new HashMapValue();
				hmValue.getMarkets().addAll(featureApplicabilitySpan.getMarkets().getMarket());
				hmValue.getBrochureModelDerivatives().addAll(featureApplicabilitySpan.getBrochureModelDerivatives().getBrochureModelDerivative());
				hmValue.getFeatures().add(featureApplicabilitySpan.getFeatures().getFeature());
				hm.put(localKey, hmValue);
			}
		}
		
		System.out.println("Hash Map created and it's size is " + hm.size());
	}

	private static void mapIncludedFamilies(FeatureApplicability featureApplicability,	FeatureApplicabilityType featureApplicability2) {
		IncludedFamilyType includedFamily;
		IncludedFamilyCollection includedFamilyCollection = new IncludedFamilyCollection();
		
		featureApplicability2.getIncludedFamiliesAndFeatureApplicabilitySpans().add(includedFamilyCollection);
		
		for (Family inFamily : featureApplicability.getIncludedFamilies().getFamily()) {
			includedFamily = new IncludedFamilyType();
			includedFamily.setCode(inFamily.getCode());
			includedFamily.setStartEvent(inFamily.getStartEvent());
			
			includedFamilyCollection.getFamily().add(includedFamily);
		}
	}

	private static void mapMarketAvailability(ProductRange inProductRange, ProductRangeType outProductRange) {
		outProductRange.setMarketAvailability(new MarketAvailabilitySpanCollection());
		
		MarketAvailabilitySpanType outMarketAvailabilitySpanType;
		BrochureModelDerivativeType outBrochureModelDerivativeType = null;
		
		for (MarketAvailabilitySpan inMarketAvailabilitySpan : inProductRange.getMarketAvailability().getMarketAvailabilitySpan()) {
			outMarketAvailabilitySpanType = new MarketAvailabilitySpanType();
			outMarketAvailabilitySpanType.setBrochureModelDerivatives(new BrochureModelDerivativeCollection());
			outMarketAvailabilitySpanType.setMarket(inMarketAvailabilitySpan.getMarket());
			outMarketAvailabilitySpanType.setIsAvailable_0020(Boolean.parseBoolean(inMarketAvailabilitySpan.getIsAvailable()));
			outMarketAvailabilitySpanType.setStartEvent(inMarketAvailabilitySpan.getStartEvent());
			outMarketAvailabilitySpanType.setEndEvent(inMarketAvailabilitySpan.getEndEvent());
			for (BrochureModelDerivative inBMD : inMarketAvailabilitySpan.getBrochureModelDerivatives().getBrochureModelDerivative()) {
				outBrochureModelDerivativeType = new BrochureModelDerivativeType();
				outBrochureModelDerivativeType.setBrochureModel(inBMD.getBrochureModel());
				outBrochureModelDerivativeType.setDerivative(inBMD.getDerivative());
				outMarketAvailabilitySpanType.getBrochureModelDerivatives().getBrochureModelDerivative().add(outBrochureModelDerivativeType);
			}
			outProductRange.getMarketAvailability().getMarketAvailabilitySpan().add(outMarketAvailabilitySpanType);
		}
		
	}

	private static void mapBrochureModels(ProductRange inProductRange, ProductRangeType outProductRange) {
		outProductRange.setBrochureModels(new BrochureModelCollection());
		
		BrochureModelType outBrochureModel;
		FeatureCodeType featureCodeTypeDF;
		FeatureCodeType featureCodeTypeForDerivative;
		for (BrochureModel inBrochureModel : inProductRange.getBrochureModels().getBrochureModel()) {

			featureCodeTypeDF = new FeatureCodeType();
			featureCodeTypeDF.setCode(inBrochureModel.getBrochureModelDefiningFeatures().getFeature().getCode());
			featureCodeTypeForDerivative = new FeatureCodeType();
			featureCodeTypeForDerivative.setCode(inBrochureModel.getDerivatives().getFeature().getCode());
			
			outBrochureModel = new BrochureModelType();
			outBrochureModel.setDerivatives(new FeatureCodeCollection());
			outBrochureModel.setBrochureModelDefiningFeatures(new FeatureCodeCollection());
			outBrochureModel.setCode(inBrochureModel.getCode());
			outBrochureModel.setDescription(inBrochureModel.getDescription());
			outBrochureModel.setFeature(inBrochureModel.getFeature());
			outBrochureModel.getBrochureModelDefiningFeatures().getFeature().add(featureCodeTypeDF);
			outBrochureModel.getDerivatives().getFeature().add(featureCodeTypeForDerivative);
			
			outProductRange.getBrochureModels().getBrochureModel().add(outBrochureModel);
		}
		
	}

	private static void mapModelYearMappings(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No model year mappings available from source as of now
		
		
	}

	private static void mapFeatureAssociations(ProductRange inProductRange, ProductRangeType outProductRange) {
		ProductRangeFeatureAssociationCollection featureAssociationCollection = new ProductRangeFeatureAssociationCollection();
		outProductRange.setFeatureAssociations(featureAssociationCollection);
		
		ProductRangeFeatureAssociationType outFeature;
		EffectivityType outEffectivity;
		
		for (Feature feature : inProductRange.getFeatureAssociations().getFeature()) {
			outEffectivity = new EffectivityType();
			outEffectivity.setStartEvent(feature.getEffectivities().getEffectivity().getStartEvent());
			outEffectivity.setEndEvent(feature.getEffectivities().getEffectivity().getEndEvent());
			
			outFeature = new ProductRangeFeatureAssociationType();
			outFeature.setEffectivities(new EffectivityCollection());
			outFeature.setCode(feature.getCode());
			outFeature.setPriority(BigInteger.valueOf(feature.getPriority()));
			outFeature.getEffectivities().getEffectivity().add(outEffectivity);
			
			featureAssociationCollection.getFeature().add(outFeature);
		}
		
	}

	private static void mapEvents(ProductRange inProductRange, ProductRangeType outProductRange) {
		outProductRange.setEvents(new EventCollection());
		List<EventType> outputEventList = outProductRange.getEvents().getEvent();
		EventType outEvent;
		for (Event event : inProductRange.getEvents().getEvent()) {
			outEvent = new EventType();
			outEvent.setCode(event.getCode());
			outEvent.setDescription(event.getDescription());
			outEvent.setDate(event.getDate());
			outEvent.setSecurityLevel(SecurityLevelEnum.valueOf(event.getSecurityLevel().toUpperCase().trim()));
			outEvent.setEventType(EventTypeEnum.valueOf(event.getEventType().trim().toUpperCase()));
			outputEventList.add(outEvent);
		}
		
		outProductRange.getEvents().getEvent().addAll(outputEventList);
		
	}

	private static void mapProgrammes(ProductRange inProductRange, ProductRangeType outProductRange) {
		// No programmes from source to map as of now
		
	}

	private static void mapBasics(ProductRange inProductRange, ProductRangeType outProductRange) {
		BasicsType basics = new BasicsType();
		FamilyCodeCollection brochureModelDefiningFeatureFamilies = new FamilyCodeCollection();
		basics.setBrochureModelDefiningFeatureFamilies(brochureModelDefiningFeatureFamilies);
		outProductRange.setBasics(basics);
		
		FamilyCodeType familyCodeType = new FamilyCodeType();
		familyCodeType.setCode(inProductRange.getBasics().getBrochureModelDefiningFeatureFamilies().getFamily().getCode());
		outProductRange.getBasics().getBrochureModelDefiningFeatureFamilies().getFamily().add(familyCodeType);
		outProductRange.getBasics().setBrand(inProductRange.getBasics().getBrand());
		outProductRange.getBasics().setDescription(inProductRange.getBasics().getDescription());
		outProductRange.getBasics().setFeature(inProductRange.getBasics().getFeature());
		//outProductRange.getBasics().setProductGroup(inProductRange.getBasics().ge);
		
	}

	
}
