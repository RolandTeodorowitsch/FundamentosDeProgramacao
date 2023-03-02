PDF =	\
	pucrs-ep-fprog-unidade_03-decisoes-laminas.pdf \
	pucrs-ep-fprog-unidade_03-decisoes-exercicios_sobre_algoritmos.pdf \
	pucrs-ep-fprog-unidade_03-decisoes-lista_de_exercicios.pdf

all:	$(PDF)

%.pdf:	%.tex
	@pdflatex -shell-escape $<
	@pdflatex -shell-escape $<

clean:
	@rm -f *~ *.pyg *.log *.out *.aux *.toc *.nav *.snm *.vrb
	@rm -rf _minted-*
