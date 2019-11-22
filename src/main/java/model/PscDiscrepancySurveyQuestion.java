package model;

import java.util.HashMap;

/**
 * Represents a question on the PSC Discrepancies survey, encapsulating a unique name and the column
 * number in the CSV generated by the survey. Given a column number, the matching question can be
 * retrieved using {@link #getByZeroIndexId(int)}.
 * 
 * <h2>Naming</h2>
 * Leaving aside UNKNOWN, the names of the values of this enum follow a pattern.
 * Each enum starts with the list of one-or-more PSC Discrepancy types:
 * <ul>
 * <li>DTPSCTYPE - the currently recorded PSC Type is wrong. 
 * e.g. the existing info at CH says the PSC is an ORP, when it should be Person. The correct info will be filled in within this survey.</li>
 * <li>DTPSCMISSING - a PSC is missing from the CH records and the details will be filled in within this survey.</li>
 * <li>DTPERSON - some of the info about this person PSC is wrong.</li>
 * <li>DTCOMPANY - some of the info about this company PSC is wrong.</li>
 * <li>DTORP - some of the info about this ORP PSC is wrong.</li>
 * <li>more to follow</li>
 * </ul>
 * Next in the enum name is one of:
 * <ul>
 * <li>REGISTERED - this will be a question about what info is already stored on the CH register.</li>
 * <li>OEPROVIDED - this will be a question about what the Obliged Entity proposes should be stored on the CH register.</li>
 * <li>DISCREPANCYSUBTYPE - this will be a question about what specific subtype of discrepancy this is.</li>
 * </ul>
 * The last part of the enum shows the specific question, e.g. ADDRESS_1
 */
public enum PscDiscrepancySurveyQuestion {
    UNKNOWN(-1, false),
    DTPSCTYPE_REGISTERED_PSC_TYPE(16, false),
    DTPSCTYPE_REGISTERED_PERSON_FIRST_NAME(17, false),
    DTPSCTYPE_REGISTERED_PERSON_SURNAME(18, false),
    DTPSCTYPE_REGISTERED_PERSON_DOB_MONTH(19, false),
    DTPSCTYPE_REGISTERED_PERSON_DOB_YEAR(20, false),
    DTPSCTYPE_REGISTERED_COMPANY_NAME(21, false),
    DTPSCTYPE_REGISTERED_COMPANY_NUMBER(22, false),
    DTPSCTYPE_REGISTERED_ORP_TITLE(23, false),
    DTPSCTYPE_REGISTERED_EXEMPTION(24, false),
    DTPSCTYPE_REGISTERED_STATEMENT(25, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PSC_TYPE(26, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_FIRST_NAME(27, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_SURNAME(28, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_DOB_MONTH(29, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_DOB_YEAR(30, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_NATIONALITY(31, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_PERSON_PLACE_OF_RESIDENCE(32, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_COMPANY_NAME(33, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_COMPANY_NUMBER(34, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_COMPANY_PLACE_OF_REGISTRATION(35, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_COMPANY_INCORPORATED_LOCATION(36, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ORP_TITLE(37, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_GOVERNING_LAW(38, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_LEGAL_FORM(39, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_1(40, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_2(41, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_3(42, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_4(43, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_5(44, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_6(45, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_ADDRESS_POSTCODE(46, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_CH_NOTIFIED_OF_PSC_DATE(47, false),
    DTPSCTYPE_DTPSCMISSING_OEPROVIDED_NATURE_OF_CONTROL(48, false),
    DTPERSON_REGISTERED_PERSON_FIRST_NAME(49, false),
    DTPERSON_REGISTERED_PERSON_SURNAME(50, false),
    DTPERSON_REGISTERED_PERSON_DOB_MONTH(51, false),
    DTPERSON_REGISTERED_PERSON_DOB_YEAR(52, false),
    DTPERSON_DISCREPANCYSUBTYPE(53, false),
    ROUTING_IS_DISCREPANCY_PERSON_NAME(54, true),
    DTPERSON_OEPROVIDED_PERSON_FIRST_NAME(55, false),
    DTPERSON_OEPROVIDED_PERSON_SURNAME(56, false),
    ROUTING_IS_DISCREPANCY_PERSON_DOB(57, true),
    DTPERSON_OEPROVIDED_PERSON_DOB_MONTH(58, false),
    DTPERSON_OEPROVIDED_PERSON_DOB_YEAR(59, false),
    ROUTING_IS_DISCREPANCY_PERSON_NATIONALITY(60, true),
    DTPERSON_OEPROVIDED_PERSON_NATIONALITY(61, false),
    ROUTING_IS_DISCREPANCY_PERSON_PLACE_OF_RESIDENCE(62, true),
    DTPERSON_OEPROVIDED_PERSON_PLACE_OF_RESIDENCE(63, false),
    DTCOMPANY_REGISTERED_COMPANY_NAME(64, false),
    DTCOMPANY_REGISTERED_COMPANY_NUMBER(65, false),
    DTCOMPANY_DISCREPANCY_SUBTYPE(66, false),
    DTPSCTYPE_DTPSCMISSING_DTCOMPANY_DTEXEMPTION_OEPROVIDED_EXEMPTION(67, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_COMPANY_NAME(68, true),
    DTCOMPANY_OEPROVIDED_COMPANY_NAME(69, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_COMPANY_NUMBER(70, true),
    DTCOMPANY_OEPROVIDED_COMPANY_NUMBER(71, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_COMPANY_PLACE_OF_REGISTRATION(72, true),
    DTCOMPANY_OEPROVIDED_COMPANY_PLACE_OF_REGISTRATION(73, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_COMPANY_INCORPORATED_LOCATION(74, true),
    DTCOMPANY_OEPROVIDED_COMPANY_INCORPORATED_LOCATION(75, false),
    DTORP_REGISTERED_ORP_TITLE(76, false),
    DTORP_DISCREPANCYSUBTYPE(77, false),
    DTORP_ROUTING_IS_DISCREPANCY_ORP_TITLE(78, true),
    DTORP_OEPROVIDED_ORP_TITLE(79, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_GOVERNING_LAW(80, true),
    DTCOMPANY_DTORP_OEPROVIDED_GOVERNING_LAW(81, false),
    DTCOMPANY_ROUTING_IS_DISCREPANCY_LEGAL_FORM(82, true),
    DTCOMPANY_DTORP_OEPROVIDED_LEGAL_FORM(83, false),
    DTCOMPANY_DTPERSON_DTORP_IS_DISCREPANCY_CORRESPONDENCE_ADDRESS(84, true),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_1(85, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_2(86, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_3(87, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_4(88, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_5(89, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_6(90, false),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_CORRESPONDENCE_ADDRESS_POSTCODE(91, false),
    DTCOMPANY_DTPERSON_DTORP_ROUTING_DATE_CH_NOTIFIED_OF_PSC(92, true),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_DATE_CH_NOTIFIED_OF_PSC(93, false),
    DTCOMPANY_DTPERSON_DTORP_ROUTING_DATE_CH_NATURE_OF_CONTROL(94, true),
    DTCOMPANY_DTPERSON_DTORP_OEPROVIDED_NATURE_OF_CONTROL(95, false),
    DTSTATEMENT_DISCREPANCY_SUBTYPE(96, false),
    DTPSCTYPE_DTPSCMISSING_DTSTATEMENT_OEPROVIDED_STATEMENT(97, false),
    DTOTHER_ROUTING_ANY_OTHER_DISCREPANCIES(98, true),
    DTOTHER_FREETEXT(99, false);
    private static final HashMap<Integer, PscDiscrepancySurveyQuestion> INDEXED_BY_CSV_COLUMN;
    static {
        HashMap<Integer, PscDiscrepancySurveyQuestion> tmpQMap = new HashMap<>();
        PscDiscrepancySurveyQuestion[] values = values();
        for (PscDiscrepancySurveyQuestion q : values) {
            PscDiscrepancySurveyQuestion preexisting = tmpQMap.get(q.getZeroIndexedCsvColumn());
            if (preexisting != null) {
                throw new IllegalStateException(
                                "Duplicate question column index in two questions: ");
            }
            tmpQMap.put(q.getZeroIndexedCsvColumn(), q);
        }
        INDEXED_BY_CSV_COLUMN = tmpQMap;
    }
    /**
     * Returns the PscDiscrepancyQuestion that whose return for {@link #getZeroIndexedCsvColumn()}
     * matches id. If no match can be found, this returns {@link #UNKNOWN}.
     */
    public static PscDiscrepancySurveyQuestion getByZeroIndexId(int id) {
        PscDiscrepancySurveyQuestion q = INDEXED_BY_CSV_COLUMN.get(id);
        if (q == null) {
            return UNKNOWN;
        }
        return q;
    }
    private final int id;
    private final boolean isRouting;
    private PscDiscrepancySurveyQuestion(int id, boolean isRouting) {
        this.id = id;
        this.isRouting = isRouting;
    }
    public int getZeroIndexedCsvColumn() {
        return id;
    }
    public boolean isRouting() {
        return isRouting;
    }
}
