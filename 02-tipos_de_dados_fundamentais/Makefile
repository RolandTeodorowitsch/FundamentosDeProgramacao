PDF =	\
	pucrs-ep-fprog-unidade_02-tipos_de_dados_fundamentais-laminas.pdf \
	pucrs-ep-fprog-unidade_02-tipos_de_dados_fundamentais-exercicios_sobre_algoritmos.pdf \
	pucrs-ep-fprog-unidade_02-tipos_de_dados_fundamentais-lista_de_exercicios-gabarito.pdf \
	pucrs-ep-fprog-unidade_02-tipos_de_dados_fundamentais-lista_de_exercicios.pdf

all:	$(PDF)

%.pdf:	%.tex
	@pdflatex -shell-escape $<
	@pdflatex -shell-escape $<

clean:
	@rm -f *~ *.pyg *.log *.out *.aux *.toc *.nav *.snm *.vrb
	@rm -rf _minted-*
