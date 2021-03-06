package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class Scheduling extends CustomDTO {
    /**
     * ID
     */
    public Long id;
    /**
     * Título da visita
     */
    public String title;
    /**
     * Data prevista de início do agendamento
     */
    public Instant expectedStartDate;
    /**
     * Data prevista de fim do agendamento
     */
    public Instant expectedEndDate;
    /**
     * Tipo de visita
     */
    public VisitType visitType;
    /**
     * Local físico da visita
     */
    public PhysicalLocation physicalLocation;
    /**
     * Lista de visitados
     */
    public List<VisitedPerson> visitedPeople;
    /**
     * Lista de visitantes
     */
    public List<Visitor> visitors;
    /**
     * Recursos da visita
     */
    public List<SchedulingResource> schedulingResources;
    /**
     * Situação da visita
     */

    public VisitSituation visitSituation;
    /**
     * Portaria
     */
    public Lobby lobby;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public Scheduling() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Scheduling(Long id, String title, Instant expectedStartDate, Instant expectedEndDate, VisitType visitType, PhysicalLocation physicalLocation, List<VisitedPerson> visitedPeople, List<Visitor> visitors, List<SchedulingResource> schedulingResources, VisitSituation visitSituation, Lobby lobby, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.title = title;
        this.expectedStartDate = expectedStartDate;
        this.expectedEndDate = expectedEndDate;
        this.visitType = visitType;
        this.physicalLocation = physicalLocation;
        this.visitedPeople = visitedPeople;
        this.visitors = visitors;
        this.schedulingResources = schedulingResources;
        this.visitSituation = visitSituation;
        this.lobby = lobby;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Scheduling(String title, Instant expectedEndDate, VisitType visitType, VisitSituation visitSituation) {
        this.title = title;
        this.expectedEndDate = expectedEndDate;
        this.visitType = visitType;
        this.visitSituation = visitSituation;
    }

    public List<JsonPatch> getJsonPatches() {
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}