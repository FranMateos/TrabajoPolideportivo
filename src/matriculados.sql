 CREATE TABLE "MATRICULADOS" 
   (	"ALUMNOV1_DNI" VARCHAR2(9 CHAR) NOT NULL ENABLE, 
	"DEPORTEV1_COD_DEPORTE" NUMBER NOT NULL ENABLE, 
	"FECHA_MATRICULACION" DATE, 
	 CONSTRAINT "MATRICULADOS_PK" PRIMARY KEY ("ALUMNOV1_DNI", "DEPORTEV1_COD_DEPORTE"), 
	 CONSTRAINT "FK_MATRICULADOS_ALUMNO" FOREIGN KEY ("ALUMNOV1_DNI")
	  REFERENCES "HR"."ALUMNO" ("DNI") ENABLE, 
	 CONSTRAINT "FK_MATRICULADOS_DEPORTE" FOREIGN KEY ("DEPORTEV1_COD_DEPORTE")
	  REFERENCES "HR"."DEPORTE" ("COD_DEPORTE") ENABLE
   );