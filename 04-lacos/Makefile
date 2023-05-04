PDF =	\
	pucrs-ep-fprog-unidade_04-lacos-laminas.pdf \
	pucrs-ep-fprog-unidade_04-lacos-lista_de_exercicios-gabarito.pdf \
	pucrs-ep-fprog-unidade_04-lacos-lista_de_exercicios.pdf \
	pucrs-ep-fprog-unidade_04-lacos-algoritmos_com_repeticao-exercicios.pdf \
	pucrs-ep-fprog-unidade_04-lacos-algoritmos_com_repeticao-laminas.pdf

all:	$(PDF)

%.pdf:	%.tex
	@pdflatex -shell-escape $<
	@pdflatex -shell-escape $<

clean:
	@rm -f *~ *.pyg *.log *.out *.aux *.toc *.nav *.snm *.vrb
	@rm -rf _minted-*
